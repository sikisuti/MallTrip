package com.siki.malltrip.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.siki.malltrip.model.Category;

@Database(entities = {Category.class}, version = 1, exportSchema = false)
public abstract class MallTripRoomDatabase extends RoomDatabase {
    public abstract CategoryDao categoryDao();
}
