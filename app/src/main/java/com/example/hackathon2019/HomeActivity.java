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

        UserAccount account1 = new UserAccount("NoahCase","12345",25);
        UserAccount account2 = new UserAccount("NoahSchottler","54321",52);
        UserAccount account3 = new UserAccount("TrevorSchmidt","15243",252);

        final Thread[] physical = new Thread[2];
        final Thread[] emotional = new Thread[2];
        final Thread[] intellectual = new Thread[2];
        final Thread[] social = new Thread[2];
        final Thread[] spiritual = new Thread[2];
        final Thread[] environmental = new Thread[2];
        final Thread[] occupational = new Thread[2];
        
        //physical
        physical[0] =  new Thread("Workout Strategies", "discussion", "10/5/19", account1,
                "Hey, \nI'm wondering if anyone has good ideas for how to workout. I'm wanting to start but honestly I'm a little intimidated by it. How should I ease myself into it?\nThanks");
        physical[1] =  new Thread("Muscle Tension and Nauseousness", "discussion", "10/5/19", account2,
                "Hi guys\n Over the pass couple days I've been experiencing intense muscle tension and nauseousness, I'm not sure what to do and if it will ever stop.");
        //emotional
        emotional[0] = new Thread("Lost a friend", "discussion", "10/5/19", account3,
                "I just learned that one of my friends that I met through rehab passed away. I'm taking it really hard and I'm very worried");
        emotional[1] = new Thread("Angry over small things", "discussion", "10/5/19", account1,
                "Hello \n Since I quit, the smallest things tick me off. I yelled at a cashier over a small inconvenience, I did go back and apologize but I can't seem to make sense of it until time passes. What should I do?");
        //intellectual
        intellectual[0] = new Thread("Interesting article on dopamine and the brain", "discussion", "10/5/19", account3,
                "Hey everyone!\n I was fishing through articles and found an interesting, recent statement \"In parallel, changes in the extended amygdala result in negative emotional states that perpetuate drug taking as an attempt to temporarily alleviate them. Counterintuitively, in the addicted person, the actual drug consumption is associated with an attenuated dopamine increase in brain reward regions, which might contribute to drug-taking behavior to compensate for the difference between the magnitude of the expected reward triggered by the conditioning to drug cues and the actual experience of it. \"\nTell me if you want me to keep posting what I find :) ");
        intellectual[0] = new Thread("", "discussion", "10/5/19", account3,
                "");


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
                openThreadListActivity(emotional);
            }
        });
        //Physical
        buttonPhysical.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(physical);
            }
        });
        //Occupational
        buttonOccupational.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(occupational);
            }
        });
        //Spiritual
        buttonSpiritual.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(spiritual);
            }
        });
        //Social
        buttonSocial.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(social);
            }
        });
        //Environmental
        buttonEnviormental.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(environmental);
            }
        });
        //Intellectual
        buttonIntellectual.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity(intellectual);
            }
        });
    }

    public void openThreadListActivity(Thread[] threads){
        Intent intent = new Intent(this,ThreadListActivity.class);
        intent.putExtra("thread",threads);
        startActivity(intent);
    }



}
