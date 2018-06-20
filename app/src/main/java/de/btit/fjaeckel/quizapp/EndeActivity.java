package de.btit.fjaeckel.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import de.btit.fjaeckel.quizapp.db.Highscore;

public class EndeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ende);
        EditText editTextName = findViewById(R.id.editTextName);
        editTextName.setFilters(new InputFilter[]{
                new InputFilter() {
                    @Override
                    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                        StringBuilder filtered = new StringBuilder();
                        for (int i = start; i < end; i++) {
                            char character = source.charAt(i);
                            if (!Character.isWhitespace(character)) {
                                filtered.append(character);
                            }
                        }
                        return filtered.toString();
                    }
                }
        });
        final Intent intent = getIntent();
        TextView textViewFinalScore = findViewById(R.id.textViewFinalScore);
        textViewFinalScore.setText(getString(R.string.final_score, intent.getIntExtra("score", 0)));
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void speichereHighscore(View v) {
        final Intent intent = getIntent();
        final EditText editTextName = findViewById(R.id.editTextName);
        final String playerName = editTextName.getText().toString();
        if (!playerName.isEmpty()) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            MenuActivity.db.highscoreDao().insert(new Highscore(playerName, intent.getIntExtra("score", 0)));
                        }
                    }
            ).start();
        }
        Intent menuIntent = new Intent(this, MenuActivity.class);
        startActivity(menuIntent);
    }
}