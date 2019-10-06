package com.example.hackathon2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Getting information about the user from the bundle
        Bundle bundle = getIntent().getExtras();
        int days = bundle.getInt("days");
        String password = bundle.getString("password");
        String name = bundle.getString("username");

        TextView t = (TextView) findViewById(R.id.textView5);
        t.setText("Welcome to day " + days + ", " + name + "!");
        //t.setTextAlignment(4);

        //Dimension of Wellness Buttons
        Button buttonPhysical = findViewById(R.id.buttonPhysical);
        Button buttonOccupational = findViewById(R.id.buttonOccupational);
        Button buttonSpiritual = findViewById(R.id.buttonSpiritual);
        Button buttonEmotional = findViewById(R.id.buttonEmotional);
        Button buttonSocial = findViewById(R.id.buttonSocial);
        Button buttonEnviormental = findViewById(R.id.buttonEnviormental);
        Button buttonIntellectual = findViewById(R.id.buttonIntellectual);

        //Listeners that open ThreadListActivities
        //Emotional
        buttonEmotional.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Physical
        buttonPhysical.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Occupational
        buttonOccupational.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Spiritual
        buttonSpiritual.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Social
        buttonSocial.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Environmental
        buttonEnviormental.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
        //Intellectual
        buttonIntellectual.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });
    }

    public void openThreadListActivity(){
        Intent intent = new Intent(this,RecyclerViewAdapter.class);
        startActivity(intent);
    }

}
