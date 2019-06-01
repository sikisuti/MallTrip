package com.siki.malltrip.view;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.siki.malltrip.data.Category;
import com.siki.malltrip.data.CategoryRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private CategoryRepository categoryRepository;
    private LiveData<List<Category>> allCategories;

    public MainViewModel (Application application) {
        super(application);
        categoryRepository = new CategoryRepository(application);
        allCategories = categoryRepository.getAllCategories();
    }

    public LiveData<List<Category>> getAllCategories() { return allCategories; }

    public void insert(Category category) { categoryRepository.insertCategory(category); }
}
