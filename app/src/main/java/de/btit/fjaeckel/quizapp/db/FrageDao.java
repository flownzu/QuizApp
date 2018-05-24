package de.btit.fjaeckel.quizapp.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface FrageDao {
    @Query("SELECT * FROM Fragen ORDER BY RANDOM() LIMIT :count")
    List<Frage> getFragen(int count);

    @Query("SELECT * FROM Fragen WHERE kategorie = :kategorie ORDER BY RANDOM()")
    List<Frage> getFragen(String kategorie);

    @Query("SELECT * FROM Fragen WHERE kategorie = :kategorie ORDER BY RANDOM() LIMIT :count")
    List<Frage> getFragen(String kategorie, int count);

    @Query("SELECT * FROM Fragen ORDER BY RANDOM()")
    List<Frage> getFragen();

    @Query("SELECT EXISTS(SELECT 1 FROM Fragen WHERE text = :text)")
    boolean exists(String text);

    @Insert
    void insert(Frage ... fragen);

    @Delete
    void delete(Frage ... fragen);

    @Update
    void update(Frage ... fragen);
}
