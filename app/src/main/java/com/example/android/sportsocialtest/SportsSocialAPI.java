package com.example.android.sportsocialtest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Your name on 01-12-2018.
 */
public interface SportsSocialAPI {

    @GET("/testfeed")
    Call<List<SSModel>> fetchData();
}
