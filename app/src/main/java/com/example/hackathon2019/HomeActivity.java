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

        UserAccount account1 = new UserAccount("NoahCase","12345", "Alcoholism", 25);
        UserAccount account2 = new UserAccount("NoahSchottler","54321","Smoking",52);
        UserAccount account3 = new UserAccount("TrevorSchmidt","15243", "Anger Management",252);

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
                "Hi guys\n Over the pass couple days I've been experiencing muscle tension and nauseousness, I'm not sure what to do and if it will ever stop.");
        //emotional
        emotional[0] = new Thread("Lost a friend", "discussion", "10/5/19", account3,
                "I just learned that one of my friends that I met through rehab passed away. I'm taking it really hard and I'm very worried");
        emotional[1] = new Thread("Angry over small things", "discussion", "10/5/19", account1,
                "Hello \n Since I quit, the smallest things tick me off. I yelled at a cashier over a small inconvenience, I did go back and apologize but I can't seem to make sense of it until time passes. What should I do?");
        //intellectual
        intellectual[0] = new Thread("Interesting article on dopamine and the brain", "discussion", "10/5/19", account2,
                "Hey everyone!\n I was fishing through articles and found an interesting, recent statement \"In parallel, changes in the extended amygdala result in negative emotional states that perpetuate drug taking as an attempt to temporarily alleviate them. Counterintuitively, in the addicted person, the actual drug consumption is associated with an attenuated dopamine increase in brain reward regions, which might contribute to drug-taking behavior to compensate for the difference between the magnitude of the expected reward triggered by the conditioning to drug cues and the actual experience of it. \"\nTell me if you want me to keep posting what I find :) ");
        intellectual[1] = new Thread("Good books to read?", "discussion", "10/5/19", account3,
                "Hey guys do you know of any good books to read? I read Rewired by Erica Spiegelman and I feel pumped and hopeful :) Please post what has inspired you.");
        //social
        social[0] = new Thread("Will I be judged?", "discussion", "10/5/19", account1,
                "I'm scared that if my friends and family know about my condition they will treat me different. What love any advice you got\n Thanks guys");
        social[1] = new Thread("Making friends at rehab", "discussion", "10/5/19", account2,
                "Hi\n What are your thoughts on making friends with the people you meet in rehab. I've heard convincing arguments going both ways.");
        //spiritual
        spiritual[0] = new Thread("Finding the light :)", "discussion", "10/5/19", account1,
                "I've felt my willpower has strengthen the more I've read scripture. What's a verse that speaks to you?");
        spiritual[1] = new Thread("Not religious but spiritual", "discussion", "10/5/19", account3,
                "The established religions don't seem to vibe with me but I still envision a higher power and it brings me peace and clarity. I see the a bright future ahead of me!");
        //environmental
        environmental[0] = new Thread("How being Eco-Friendly has helped me", "discussion", "10/5/19", account2,
                "Hello guys and gals! When I still smoked I used to throw the butts out the window when I drove...Now I am confident in my willpower and I pick them up along with other litter when I go for my morning walk before I take my son to baseball summer camp. I never thought picking up trash would help me in my fight.");
        environmental[1] = new Thread("Sports & Feng Shui Skol", "discussion", "10/5/19", account1,
                "What's up people,\n I threw out everything alcohol-related gear in my mancave. Now it's strictly Twins, T-Wolves, Wild, Linx, MNUFC, and of course Vikings!");
        //occupational
        occupational[0] = new Thread("Co-workers and Smoke Break", "discussion", "10/5/19", account2,
                "The afternoon smoke break was where I met some of my work friends. It's very tempting to go out with them. How can I still have a fun, social interaction at work without involving nicotine?\n Thanks again guys.");
        occupational[1] = new Thread("My Boss is Supportive!", "discussion", "10/5/19", account1,
                "I worked up the courage and opened up about my struggle and my wish for freedom at work. It went waaaay better than I thought. My boss even said he'd figure out a way to have our weekly meetings so I didn't have to miss my appointments! Don't overthink it, you might be surprised.");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Getting information about the user from the bundle
        Bundle bundle = getIntent().getExtras();
        int days = bundle.getInt("days");
        String password = bundle.getString("password");
        String name = bundle.getString("username");
        String goal = bundle.getString("goal");

        TextView t = (TextView) findViewById(R.id.textView5);
        t.setText("Welcome back " + name + " to day " + days + ".\n Recovery Goal: " + goal + "");
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
