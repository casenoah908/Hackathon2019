package com.example.hackathon2019;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface API {

    @GET("AccountsList")
    Call<List<UserAccount>> accounts();
}
