package com.geekbrains.a1l6_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView myRecyclerView;
    private String[] listData = new String[] {"One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        myRecyclerView = findViewById(R.id.myRecyclerView);
        MyAdapter myAdapter = new MyAdapter(listData);
        LinearLayoutManager myLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        myRecyclerView.setLayoutManager(myLinearLayoutManager);
        myRecyclerView.setAdapter(myAdapter);
    }
}
