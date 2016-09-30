package com.example.jhon.recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.jhon.recursos.adapter.ListMascotasAdapter;
import com.example.jhon.recursos.dao.MascotaDao;
import com.example.jhon.recursos.models.Mascota;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView list;
    List<Mascota> data;
    ListMascotasAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        list = (ListView) findViewById(R.id.list);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.mascotas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        data = new ArrayList<>();
        data.addAll(MascotaDao.mascotasInit());
        adapter = new ListMascotasAdapter(data,this);
        list.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
