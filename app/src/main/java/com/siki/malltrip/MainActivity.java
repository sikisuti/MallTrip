package com.siki.malltrip;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.siki.malltrip.data.DBManagerImpl;
import com.siki.malltrip.data.DataService;
import com.siki.malltrip.data.DataServiceImpl;
import com.siki.malltrip.model.Item;

public class MainActivity extends AppCompatActivity {
    DataService dataService;

    private static final String TAG = "MainActivity";

    private LinearLayout itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = findViewById(R.id.itemList);

        dataService = new DataServiceImpl(new DBManagerImpl());

        Log.d(TAG, "onCreate: run");
    }

    @Override
    protected void onResume() {
        super.onResume();

        itemList.removeAllViews();
        for(Item item : dataService.getRequiredItems()) {
            TextView itemView = new TextView(this);
            itemView.setText(item.getName());
            itemList.addView(itemView);
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
