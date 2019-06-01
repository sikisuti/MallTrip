package com.siki.malltrip;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import com.siki.malltrip.data.CategoryRepository;
import com.siki.malltrip.data.DataService;
import com.siki.malltrip.data.Category;
import com.siki.malltrip.model.Demand;
import com.siki.malltrip.view.DemandListAdapter;
import com.siki.malltrip.view.MainViewModel;

import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    DataService dataService;
    CategoryRepository categoryRepository;

    private static final String TAG = "MainActivity";

    private ListView demands;
    private AutoCompleteTextView categoryPicker;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        demands = findViewById(R.id.lvDemandList);
        demands.setOnItemClickListener((parent, view, position, id) -> {
            Demand selectedDemand = (Demand) parent.getItemAtPosition(position);
            Intent intent = new Intent(this, DemandActivity.class);
            intent.putExtra("demand", selectedDemand);
            startActivity(intent);
            Toast.makeText(this, selectedDemand.getCategory().getName(), Toast.LENGTH_LONG).show();
        });

        categoryPicker = findViewById(R.id.categoryPicker);

        Log.d(TAG, "onCreate: run");
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<String> categoryList = mainViewModel.getAllCategories().getValue().stream().map(Category::getName).collect(Collectors.toList());
        ArrayAdapter<String> productListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categoryList);
        categoryPicker.setAdapter(productListAdapter);

        DemandListAdapter demandListAdapter = new DemandListAdapter(this, dataService.getDemands());
        demands.setAdapter(demandListAdapter);
    }

    public void btnNewShopping(View v) {
        Log.d(TAG, "New Shopping Started");
    }

    public void addDemand(View view) {
        dataService.addDemand(categoryPicker.getText().toString());
        ((DemandListAdapter) demands.getAdapter()).notifyDataSetChanged();
    }
}
