package com.example.hackathon2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ThreadListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_list);

         ArrayList<String> titles = new ArrayList<>();
         ArrayList<String> types = new ArrayList<>();
         ArrayList<UserAccount> users = new ArrayList<>();
         ArrayList<String> dates = new ArrayList<>();

         Thread[] threads = (Thread[]) getIntent().getExtras().getSerializable("thread");
        createRecyclerView(threads);



    }

    private void createRecyclerView(Thread[] threads){
        RecyclerView recyclerView = findViewById(R.id.threadCardsRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(threads, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
