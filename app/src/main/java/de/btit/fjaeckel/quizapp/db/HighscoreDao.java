package de.btit.fjaeckel.quizapp.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface HighscoreDao {
    @Query("SELECT * FROM Highscores ORDER BY score DESC LIMIT 10")
    List<Highscore> getTop10();

    @Insert
    void insert(Highscore ... highscores);

    @Delete
    void delete(Highscore ... highscores);

    @Update
    void update(Highscore ... highscores);
}
