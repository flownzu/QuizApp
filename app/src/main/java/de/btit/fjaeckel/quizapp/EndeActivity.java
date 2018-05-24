package de.btit.fjaeckel.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.btit.fjaeckel.quizapp.db.Highscore;

public class EndeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ende);
        final Intent intent = getIntent();
        TextView textViewFinalScore = findViewById(R.id.textViewFinalScore);
        textViewFinalScore.setText(getString(R.string.final_score, intent.getIntExtra("score", 0)));
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        MainActivity.db.highscoreDao().insert(new Highscore("Florian", intent.getIntExtra("score", 0)));
                    }
                }
        ).start();
    }

}