package co.astrnt.samplemanagersdk.feature.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import co.astrnt.managersdk.dao.CompanyApiDao;

public class CompanyAdapter extends ArrayAdapter<CompanyApiDao> {

    private Context context;
    private List<CompanyApiDao> data;

    public CompanyAdapter(Context context, int textViewResourceId, List<CompanyApiDao> data) {
        super(context, textViewResourceId, data);
        this.context = context;
        this.data = data;
    }

    public void setData(List<CompanyApiDao> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CompanyApiDao getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(data.get(position).getName());

        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(data.get(position).getName());

        return label;
    }
}