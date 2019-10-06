package com.example.hackathon2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

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
    UserAccount passedAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.logo);
        Picasso.get().load("https://i.redd.it/tsf30s0b2yq31.png").into(imageView);

        //instantiate views
        Button loginButton = findViewById(R.id.loginButton);



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
                        passedAccount = account;
                        openHomeActivity();
                    }else{
                        Toast.makeText(MainActivity.this,"NOPE",Toast.LENGTH_LONG);
                    }
                }
            }
        });



    }
        public UserAccount[] hardcodeAccounts () {
            UserAccount account1 = new UserAccount("NoahCase","12345", "Alcoholism", 25);
            UserAccount account2 = new UserAccount("NoahSchottler","54321", "Smoking", 52);
            UserAccount account3 = new UserAccount("TrevorSchmidt","15243", "Anger Management", 252);
            UserAccount[] accounts = {account1, account2, account3};
            return accounts;
        }

        public void openHomeActivity(){
            Intent intent = new Intent(this,HomeActivity.class);
            intent.putExtra("user", passedAccount);
            Bundle bundle = new Bundle();
            bundle.putInt("days",passedAccount.getDays());
            bundle.putString("username",passedAccount.getUsername());
            bundle.putString("password",passedAccount.getPassword());
            bundle.putString("goal",passedAccount.getGoal());
            intent.putExtras(bundle);
            startActivity(intent);

            int[] array = new int[2];
            array[0] = 3;


        }



}
