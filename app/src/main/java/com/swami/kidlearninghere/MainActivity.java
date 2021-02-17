package com.swami.kidlearninghere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.swami.kidlearninghere.module.Dashboard_card;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Dashboard_card dashboard_card = new Dashboard_card("Jayesh",R.drawable.apple,R.drawable.ball,R.drawable.ic_zebra,R.color.firstCard);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
     recyclerView.setLayoutManager(linearLayoutManager);

    }
}