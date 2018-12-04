package com.example.android.sportsocialtest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Your name on 01-12-2018.
 */
public class SportsSocialAPIAdapter {
    private static final String URL = "https://test.sportsocial.in";
    private static Retrofit retrofit;

    public static Retrofit getAdapter(){
        if(retrofit==null){
            Gson gson = new GsonBuilder().setLenient().create();
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;
    }
}
