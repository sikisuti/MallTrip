package com.siki.malltrip.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.siki.malltrip.R;
import com.siki.malltrip.model.Demand;

import java.util.List;

public class DemandListAdapter extends ArrayAdapter<Demand> {
    public DemandListAdapter(Context context, List<Demand> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Demand demand = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.demand_item, parent, false);
        }
        // Lookup view for data population
        TextView tvDemandItemName = (TextView) convertView.findViewById(R.id.tvDemandItemName);
        // Populate the data into the template view using the data object
        tvDemandItemName.setText(demand.getCategory().getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
