package de.btit.fjaeckel.quizapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import de.btit.fjaeckel.quizapp.db.Highscore;
import de.btit.fjaeckel.quizapp.recyclerview.RecyclerViewAdapter;

public class HighscoreActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        List<Highscore> top10 = MenuActivity.db.highscoreDao().getTop10();
                        String[] highscores = new String[top10.size()];
                        for (int i = 0; i < top10.size(); i++){
                            highscores[i] = top10.get(i).toString();
                        }
                        Context context = getApplicationContext();
                        RecyclerView recyclerView = findViewById(R.id.recyclerView);
                        LinearLayoutManager recylerViewLayoutManager = new LinearLayoutManager(context);
                        recyclerView.setLayoutManager(recylerViewLayoutManager);
                        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(context, highscores);
                        recyclerView.setAdapter(recyclerViewAdapter);
                    }
                }
        ).start();
    }

}
