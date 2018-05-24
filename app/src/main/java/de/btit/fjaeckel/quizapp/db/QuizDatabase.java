package de.btit.fjaeckel.quizapp.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Highscore.class, Frage.class}, version = 1, exportSchema = false)
public abstract class QuizDatabase extends RoomDatabase {
    public abstract HighscoreDao highscoreDao();
    public abstract FrageDao frageDao();
}
