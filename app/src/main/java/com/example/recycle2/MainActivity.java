package com.example.recycle2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import Adapters.dataAdapters;
import Models.dataModels;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    dataAdapters adapters;
    ArrayList<dataModels> userlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdata();
        initRecycler();

    }

    private void initdata() {
        userlist= new ArrayList<>();
        userlist.add(new dataModels((R.drawable.nidhi),"Nidhi","10:43 am","hello babes","-----------------"));
        userlist.add(new dataModels((R.drawable.shubham),"Shubham","12:43 am","hello didi","-----------------"));
        userlist.add(new dataModels((R.drawable.papa),"Papa","6:43 am","hello beta","-----------------"));
        userlist.add(new dataModels((R.drawable.mummy),"Mummy","8:43 am","hello maiyyan","-----------------"));
    }

    private void initRecycler() {
        recycler=findViewById(R.id.recycle);
        adapters=new dataAdapters(userlist,this);
        recycler.setAdapter(adapters);
        LinearLayoutManager linearlayoutmanger =new LinearLayoutManager(this);
        recycler.setLayoutManager(linearlayoutmanger);
    }
}