package de.btit.fjaeckel.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import de.btit.fjaeckel.quizapp.db.Highscore;

public class EndeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ende);
        Intent intent = getIntent();
        TextView textViewFinalScore = findViewById(R.id.textViewFinalScore);
        textViewFinalScore.setText(getString(R.string.final_score, intent.getIntExtra("score", 0)));
        MainActivity.db.highscoreDao().insert(new Highscore("Florian", intent.getIntExtra("score", 0)));
        List<Highscore> highscores = MainActivity.db.highscoreDao().getTop10();
        for (Highscore highscore : highscores) System.out.print(highscore.getName() + ": " + highscore.getScore());
    }

}