package de.btit.fjaeckel.quizapp;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonFrage;
    private Button buttonAntwort1;
    private Button buttonAntwort2;
    private Button buttonAntwort3;
    private Button buttonAntwort4;
    private Button[] antwortButton;
    private int fragenIndex = -1;
    private Frage frage;
    private int score = 0;
    private ObjectAnimator progressBarProgressAnimator;
    private ValueAnimator progressBarProgressColorAnimator;
    private boolean beantwortet;
    private boolean ende;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFrage = findViewById(R.id.buttonFrage);
        buttonAntwort1 = findViewById(R.id.buttonAntwort1);
        buttonAntwort1 = findViewById(R.id.buttonAntwort1);
        buttonAntwort2 = findViewById(R.id.buttonAntwort2);
        buttonAntwort3 = findViewById(R.id.buttonAntwort3);
        buttonAntwort4 = findViewById(R.id.buttonAntwort4);
        antwortButton = new Button[]{buttonAntwort1, buttonAntwort2, buttonAntwort3, buttonAntwort4};
        ende = false;
        setupProgressBar();
        nextFrage();
        updateScore(0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if  (ende){
            ende = false;
            updateScore(0);
            Collections.shuffle(FragenKatalog.alleFragen);
            bindFrage(FragenKatalog.alleFragen.get(fragenIndex).shuffleAntworten());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (ende){
            progressBarProgressAnimator.cancel();
            progressBarProgressColorAnimator.cancel();
        }
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
    }

    private void setupProgressBar(){
        final ProgressBar pb = findViewById(R.id.progressBarTimer);
        // Setze die Progressbar Value auf 65000 damit der Ablauf sehr smooth ist - außerdem lässt sich so gut durch die abgelaufene Zeit in ms eine Punktzahl ausrechnen
        pb.setMax(65000);
        progressBarProgressAnimator = ObjectAnimator.ofInt(pb, "progress", 65000, 0);
        // 20 Sekunden Zeit für eine Frage
        progressBarProgressAnimator.setDuration(20000);
        progressBarProgressAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                // Falls die Frage nicht beantwortet wurde und das Spiel noch nicht vorbei ist soll die Frage als falsch beantwortet werden
                if (!beantwortet && !ende) beantworteFrage(false, null);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        progressBarProgressColorAnimator = ValueAnimator.ofObject(new ArgbEvaluator(), Color.GREEN, Color.RED);
        progressBarProgressColorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                // Lasse die Farbe des Progress von Grün zu Rot wandern je mehr Zeit verschreitet
                pb.getProgressDrawable().setColorFilter((int)animation.getAnimatedValue(), PorterDuff.Mode.MULTIPLY);
            }
        });
        progressBarProgressColorAnimator.setDuration(20000);
    }

    private void updateScore(int value){
        score = value;
        TextView textView = findViewById(R.id.textViewScore);
        textView.setText(getString(R.string.score, score));
    }

    @Override
    public void onClick(View v){
        if (v instanceof Button) {
            boolean erfolg = false;
            beantwortet = true;
            progressBarProgressAnimator.cancel();
            progressBarProgressColorAnimator.cancel();
            switch(v.getId()){
                case R.id.buttonAntwort1:
                    erfolg = frage.getRichtig() == 1;
                    break;
                case R.id.buttonAntwort2:
                    erfolg = frage.getRichtig() == 2;
                    break;
                case R.id.buttonAntwort3:
                    erfolg = frage.getRichtig() == 3;
                    break;
                case R.id.buttonAntwort4:
                    erfolg = frage.getRichtig() == 4;
                    break;
            }
            beantworteFrage(erfolg, v);
        }
    }

    private void beantworteFrage(boolean erfolg, View v){
        // Wenn eine Frage beantwortet wird sollen erstmal alle antwort Buttons nicht mehr enabled sein sodass man nicht mehrere Antworten hintereinander drücken kann
        buttonAntwort1.setEnabled(false);
        buttonAntwort2.setEnabled(false);
        buttonAntwort3.setEnabled(false);
        buttonAntwort4.setEnabled(false);
        // Rufe die herkömmliche Farbe des Buttons ab
        int colorFrom = getResources().getColor(R.color.colorButtonNormal);
        ValueAnimator richtigAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, Color.GREEN, colorFrom);
        // Eine Animation = 350ms, je schneller desto stärker ist der Blinkeffekt
        // insgesamt 5 mal abspielen
        richtigAnimation.setDuration(350);
        richtigAnimation.setRepeatCount(5);
        if (erfolg) {
            final Button antwortButton = (Button)v;
            richtigAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    // animiere die Farbe des Button Background von normal zu grün und wieder zu normal -> Blinkeffekt
                    antwortButton.getBackground().setColorFilter((int)animation.getAnimatedValue(), PorterDuff.Mode.MULTIPLY);
                }
            });
            richtigAnimation.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    // Bei Ende der Animation soll direkt die nächste Frage angezeigt werden
                    nextFrage();
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
            richtigAnimation.start();
            // Update die Score mit dem ProgressBar Fortschritt, dabei soll 50 der Minimalwert sein und es gibt eine anfängliche Toleranz von 3s bei der die volle Punktzahl von 100 erreicht wird
            // 65000+50000 = 115000 / 1000 = 115, 20sek Animation -> 20 * 0.15 = 3s
            updateScore(score + (Math.min(((int)progressBarProgressAnimator.getAnimatedValue() + 50000) / 1000, 100)));
        }
        else{
            // Bei einer falschen Animation sollen zwei Button animiert werden
            final Button richtigerButton = antwortButton[frage.getRichtig() - 1];
            final Button falscherButton = (Button)v;
            richtigAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    richtigerButton.getBackground().setColorFilter((int)animation.getAnimatedValue(), PorterDuff.Mode.MULTIPLY);
                }
            });
            ValueAnimator falschAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, Color.RED, colorFrom);
            falschAnimation.setDuration(350);
            falschAnimation.setRepeatCount(5);
            falschAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    // Animiere nur den falschen Button falls dieser wirklich geklickt wird
                    if (falscherButton != null) {
                        falscherButton.getBackground().setColorFilter((int) animation.getAnimatedValue(), PorterDuff.Mode.MULTIPLY);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(richtigAnimation, falschAnimation);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    if (!ende) nextFrage();
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
        }
    }

    public void bindFrage(Frage f){
        frage = f;
        buttonAntwort1.setEnabled(true);
        buttonAntwort2.setEnabled(true);
        buttonAntwort3.setEnabled(true);
        buttonAntwort4.setEnabled(true);
        buttonFrage.setText(frage.getText());
        buttonAntwort1.setText(frage.getAntwort1());
        buttonAntwort2.setText(frage.getAntwort2());
        buttonAntwort3.setText(frage.getAntwort3());
        buttonAntwort4.setText(frage.getAntwort4());
        progressBarProgressAnimator.start();
        progressBarProgressColorAnimator.start();
        beantwortet = false;
    }

    private void nextFrage(){
        fragenIndex++;
        if (fragenIndex >= FragenKatalog.alleFragen.size()){
            fragenIndex = 0;
            Intent intent = new Intent(this, EndeActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
            ende = true;
        }
        else bindFrage(FragenKatalog.alleFragen.get(fragenIndex).shuffleAntworten());
    }
}
