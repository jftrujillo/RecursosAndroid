package com.example.jhon.recursos.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.jhon.recursos.models.Mascota;

import java.util.List;

/**
 * Created by jhon on 28/09/16.
 */

public class ListMascotasAdapter extends BaseAdapter {
    List<Mascota> data;
    Context context;

    public ListMascotasAdapter(List<Mascota> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context,)

        return null;
    }
}
