package com.siki.malltrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.siki.malltrip.data.DataService;
import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.Product;

public class MainActivity extends AppCompatActivity {
    DataService dataService;

    private static final String TAG = "MainActivity";

    private LinearLayout itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = findViewById(R.id.itemList);

        dataService = ((MallTripApp) getApplication()).getDataService();

        Log.d(TAG, "onCreate: run");
    }

    @Override
    protected void onResume() {
        super.onResume();

        itemList.removeAllViews();
        for(Demand demand : dataService.getRequiredProducts()) {
            TextView productView = new TextView(this);
            productView.setText(demand.getProduct().getName());
            itemList.addView(productView);
        }
    }

    public void btnAddItemOnClick(View v) {
        Log.d(TAG, "btnAddItem clicked");
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

    public void btnNewShopping(View v) {
        Log.d(TAG, "New Shopping Started");
    }
}
