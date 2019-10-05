package com.example.hackathon2019;

import retrofit2.Call;
import retrofit2.http.POST;

public interface API {

    @POST("")
    Call<UserAccount> account();
}
