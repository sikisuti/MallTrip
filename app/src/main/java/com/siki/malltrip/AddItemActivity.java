package com.siki.malltrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.siki.malltrip.data.DataService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
