package com.siki.malltrip.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.siki.malltrip.R;
import com.siki.malltrip.data.Category;
import com.siki.malltrip.model.Demand;

import java.util.List;

public class CategoryListAdapter extends ArrayAdapter<Category> {
    public CategoryListAdapter(Context context, List<Category> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Category category = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_item, parent, false);
        }
        // Lookup view for data population
        TextView tvCategoryItemName = (TextView) convertView.findViewById(R.id.categoryItemName);
        // Populate the data into the template view using the data object
        tvCategoryItemName.setText(category.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
