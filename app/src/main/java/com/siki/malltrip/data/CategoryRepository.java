package com.siki.malltrip.data;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.siki.malltrip.model.Category;

import java.util.List;

public class CategoryRepository {
    private CategoryDao categoryDao;
    private LiveData<List<Category>> allCategories;

    public CategoryRepository(MallTripRoomDatabase database) {
        categoryDao = database.categoryDao();
        allCategories = categoryDao.getAllCategories();
    }

    public LiveData<List<Category>> getAllCategories() {
        return allCategories;
    }

    public void insertCategory(Category category) {
        new insertAsyncTask(categoryDao).execute(category);
    }

    private static class insertAsyncTask extends AsyncTask<Category, Void, Void> {
        private CategoryDao asyncTask;

        insertAsyncTask(CategoryDao dao) {
            asyncTask = dao;
        }

        @Override
        public Void doInBackground(final Category... params) {
            asyncTask.insertCategory(params[0]);
            return null;
        }
    }
}
