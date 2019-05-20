package com.siki.malltrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import com.siki.malltrip.data.DataService;
import com.siki.malltrip.model.Category;
import com.siki.malltrip.model.Demand;
import com.siki.malltrip.view.DemandListAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    DataService dataService;

    private static final String TAG = "MainActivity";

    private ListView demands;
    private AutoCompleteTextView categoryPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demands = findViewById(R.id.lvDemandList);
        demands.setOnItemClickListener((parent, view, position, id) -> {
            Demand selectedDemand = (Demand) parent.getItemAtPosition(position);
            Toast.makeText(this, selectedDemand.getCategory().getName(), Toast.LENGTH_LONG).show();
        });

        categoryPicker = findViewById(R.id.categoryPicker);

        dataService = ((MallTripApp) getApplication()).getDataService();

        Log.d(TAG, "onCreate: run");
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<String> categoryList = dataService.getCategories().stream().map(Category::getName).collect(Collectors.toList());
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
