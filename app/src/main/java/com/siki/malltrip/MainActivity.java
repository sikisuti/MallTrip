package com.siki.malltrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.siki.malltrip.data.DataService;
import com.siki.malltrip.model.Demand;
import com.siki.malltrip.view.DemandListAdapter;
import com.siki.malltrip.view.ProductListAdapter;

import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    DataService dataService;

    private static final String TAG = "MainActivity";

    private ListView requirements;
    private AutoCompleteTextView productPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requirements = findViewById(R.id.lvDemandList);
        productPicker = findViewById(R.id.itemPicker);

        dataService = ((MallTripApp) getApplication()).getDataService();

        Log.d(TAG, "onCreate: run");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //TODO: not working !!!
        ProductListAdapter productListAdapter = new ProductListAdapter(this, dataService.getProducts());
        productPicker.setAdapter(productListAdapter);

        DemandListAdapter demandListAdapter = new DemandListAdapter(this, dataService.getRequiredProducts());
        requirements.setAdapter(demandListAdapter);
    }

    public void btnNewShopping(View v) {
        Log.d(TAG, "New Shopping Started");
    }

    public void addDemand(View view) {

    }
}
