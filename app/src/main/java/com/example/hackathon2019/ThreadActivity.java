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


        //instantiate views
        TextView title = findViewById(R.id.titleTextView);
        TextView userAndDate = findViewById(R.id.userAndDateTextView);
        TextView description = findViewById(R.id.descriptionTextView);

        //dimensionThreads[position].getType()+" - "+dimensionThreads[position].getTitle()
        title.setText(thread.getType()+" - "+thread.getTitle());
        userAndDate.setText(thread.getUserName()+" "+thread.getUserDays()+" days - "+thread.getDateTime());
        description.setText(thread.getDescription());

    }
}
