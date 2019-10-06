package com.example.hackathon2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);

        Thread thread = (Thread) getIntent().getExtras().getSerializable("thread");


        TextView title = findViewById(R.id.titleTextView);
        //dimensionThreads[position].getType()+" - "+dimensionThreads[position].getTitle()
        title.setText(thread.getType()+" - "+thread.getTitle());
    }
}
