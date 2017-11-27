package com.example.mohamed.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler= (RecyclerView)findViewById(R.id.rv_items);
        LinearLayoutManager linearlayout= new LinearLayoutManager(this);
        recycler.setLayoutManager(linearlayout);
        recycler.setHasFixedSize(true);
        myAdapter=new Adapter();
        recycler.setAdapter(myAdapter);
    }
}
