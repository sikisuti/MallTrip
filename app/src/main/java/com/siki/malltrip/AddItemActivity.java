package com.siki.malltrip;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.siki.malltrip.data.DataService;

import java.util.ArrayList;
import java.util.List;

public class AddItemActivity extends AppCompatActivity {
    private DataService dataService;
    private static final List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        dataService =((MallTripApp) getApplication()).getDataService();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
