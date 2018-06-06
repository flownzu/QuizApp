package de.btit.fjaeckel.quizapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import de.btit.fjaeckel.quizapp.db.Frage;
import de.btit.fjaeckel.quizapp.db.QuizDatabase;

public class MenuActivity extends Activity {
    public static QuizDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        db = Room.databaseBuilder(getApplicationContext(), QuizDatabase.class, "QuizDB").fallbackToDestructiveMigration().build();
        try {
            Thread t = new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            for (Frage f : FragenKatalog.alleFragen){
                                if (!db.frageDao().exists(f.getText())) db.frageDao().insert(f);
                                else db.frageDao().update(f);
                            }
                        }
                    }
            );
            t.start();
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onClickPlay(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void onClickHighscores(View v){
        Intent intent = new Intent(this, HighscoreActivity.class);
        startActivity(intent);
    }
}
