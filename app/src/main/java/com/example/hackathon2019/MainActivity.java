package com.example.hackathon2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    int accountsCount = 3;
    UserAccount[] accounts = hardcodeAccounts();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wassup
        //My wassup
        //Schottler did this

        //instantiate objects


        //instantiate views
        Button loginButton = findViewById(R.id.loginButton);

        //Dimension of Wellness Buttons
        Button buttonPhysical = findViewById(R.id.buttonPhysical);
        Button buttonOccupational = findViewById(R.id.buttonOccupational);
        Button buttonSpiritual = findViewById(R.id.buttonSpiritual);
        Button buttonEmotional = findViewById(R.id.buttonEmotional);
        Button buttonSocial = findViewById(R.id.buttonSocial);
        Button buttonEnviormental = findViewById(R.id.buttonEnviormental);
        Button buttonIntellectual = findViewById(R.id.buttonIntellectual);

        final TextView username = findViewById(R.id.usernameBox);
        final TextView password = findViewById(R.id.passwordBox);


        /*
        //RETROFIT instantiation
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://github.com/casenoah908/ColdTurkeyAccounts/edit/master/")
                .addConverterFactory(GsonConverterFactory.create());
        //interface methods add to the base url with their relative urls
        Retrofit retrofit = builder.build(); //build whats defined above
        API client = retrofit.create(API.class);
        //create call
        Call<List<UserAccount>> call = client.accounts();
        //end RETROFIT Instantiation

        call.enqueue(new Callback<List<UserAccount>>() {
            @Override
            public void onResponse(Call<List<UserAccount>> call, Response<List<UserAccount>> response) {
                for(UserAccount account: response.body()){
                    userNames.add(account.getUsername());
                }
            }

            @Override
            public void onFailure(Call<List<UserAccount>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"NOPE: "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        */

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //on click of login
            public void onClick(View v) {
                String currentUsername = username.getText().toString();
                String currentPassword = password.getText().toString();
                for(UserAccount account: accounts){
                    //if user logging in is in the accounts...
                    if((account.getUsername().equals(currentUsername))&&(account.getPassword().equals(currentPassword))){
                        //start home activity
                        openHomeActivity();
                    }else{
                        Toast.makeText(MainActivity.this,"NOPE",Toast.LENGTH_LONG);
                    }
                }
            }
        });

        buttonEmotional.setOnClickListener(new View.OnClickListener(){
            @Override
            //On Click of of "Emotional Wellness" Button
            public void onClick(View v){
                openThreadListActivity();
            }
        });

    }
        public UserAccount[] hardcodeAccounts () {
            UserAccount account1 = new UserAccount("NoahCase","12345");
            UserAccount account2 = new UserAccount("NoahSchottler","54321");
            UserAccount account3 = new UserAccount("TrevorSchmidt","15243");
            UserAccount[] accounts = {account1, account2, account3};
            return accounts;
        }

        public void openHomeActivity(){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        }

        public void openThreadListActivity(){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
    }

}
