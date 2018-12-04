package com.example.android.sportsocialtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        extractTestData();
    }

    private void extractTestData() {
        SportsSocialAPI sportsSocialAPI = SportsSocialAPIAdapter.getAdapter().create(SportsSocialAPI.class);
        retrofit2.Call<List<SSModel>> call = sportsSocialAPI.fetchData();

        call.enqueue(new Callback<List<SSModel>>() {


            @Override
            public void onResponse(retrofit2.Call<List<SSModel>> call, Response<List<SSModel>> response) {
                SSViewAdapter ssViewAdapter = new SSViewAdapter(response.body());
                recyclerView.setAdapter(ssViewAdapter);
            }

            @Override
            public void onFailure(retrofit2.Call<List<SSModel>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
