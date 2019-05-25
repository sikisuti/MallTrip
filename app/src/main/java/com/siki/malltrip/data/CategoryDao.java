package com.siki.malltrip.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.siki.malltrip.model.Category;

import java.util.List;

@Dao
public interface CategoryDao {
    @Insert
    void insertCategory(Category category);

    @Query("DELETE FROM Categories")
    void deleteAllCategories();

    @Query("SELECT * FROM Categories")
    LiveData<List<Category>> getAllCategories();
}
