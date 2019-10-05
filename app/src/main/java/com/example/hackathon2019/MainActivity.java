package com.example.hackathon2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wassup
        //My wassup
        //Schottler did this

        //instantiate objects
        final ArrayList<String> userNames = new ArrayList<>();
        //instantiate views



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

    }
}
