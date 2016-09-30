package com.example.jhon.recursos.adapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.jhon.recursos.R;
import com.example.jhon.recursos.models.Mascota;
import com.squareup.picasso.Picasso;

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
        View v = convertView;
        if (v == null){
            v =  View.inflate(context, R.layout.template_list_mascotas,null);
        }
        ImageView img = (ImageView) v.findViewById(R.id.imagen);
        TextView raza = (TextView) v.findViewById(R.id.raza);
        TextView estado = (TextView) v.findViewById(R.id.estado);
        String[] estadoString = context.getResources().getStringArray(R.array.estado);
        Picasso.with(context).load(data.get(position).getUrlImg()).into(img);
        raza.setText(data.get(position).getRaza());
        estado.setText(estadoString[data.get(position).getEstado()]);
        if (!context.getResources().getBoolean(R.bool.isPortrait)){
            TextView textView = (TextView) v.findViewById(R.id.descripcion);
            textView.setText(data.get(position).getDescripcion());
        }

        return v;
    }
}
