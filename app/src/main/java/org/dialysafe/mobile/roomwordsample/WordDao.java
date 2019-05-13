package org.dialysafe.mobile.roomwordsample;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteALl();

    @Query("SELECT * from word_table ORDER BY word ASC")
    List<Word> getAllWords();
}
