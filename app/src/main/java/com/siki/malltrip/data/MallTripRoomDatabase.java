package com.siki.malltrip.data;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Category.class}, version = 1, exportSchema = false)
public abstract class MallTripRoomDatabase extends RoomDatabase {
    public abstract CategoryDao categoryDao();

    private static volatile MallTripRoomDatabase INSTANCE;

    static MallTripRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MallTripRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MallTripRoomDatabase.class, "word_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback(){

                @Override
                public void onOpen (@NonNull SupportSQLiteDatabase db){
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private CategoryDao categoryDao;

        PopulateDbAsync(MallTripRoomDatabase db) {
            categoryDao = db.categoryDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            categoryDao.deleteAllCategories();
            categoryDao.insertCategory(new Category.Builder().setName("Joghurt").setType("Tejtermék").build());
            categoryDao.insertCategory(new Category.Builder().setName("Alma").setType("Gyümölcs").build());
            return null;
        }
    }
}
