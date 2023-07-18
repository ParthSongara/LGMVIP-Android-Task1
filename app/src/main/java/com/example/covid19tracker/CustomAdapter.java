package com.example.covid19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    public Context context;
    public List<Model> dataList;

    public CustomAdapter(Context context, List<Model> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.testing, parent, false);
        }

        Model model = dataList.get(position);

        TextView textViewDistrictName = convertView.findViewById(R.id.textViewDistrictName);
        TextView textViewCasesDetails = convertView.findViewById(R.id.textViewCasesDetails);
        ImageView imageViewArrowUpward = convertView.findViewById(R.id.imageViewArrowUpward);

        textViewDistrictName.setText(model.getDistrictName());

        String casesDetailsText = context.getString(R.string.cases_details,
                model.getActiveCases(),
                model.getConfirmedCases(),
                model.getDeceasedCases(),
                model.getRecoveredCases());

        textViewCasesDetails.setText(casesDetailsText);

        if (model.getActiveCases() > 1000) {
            imageViewArrowUpward.setVisibility(View.VISIBLE);
        } else {
            imageViewArrowUpward.setVisibility(View.GONE);
        }

        return convertView;
    }
}
