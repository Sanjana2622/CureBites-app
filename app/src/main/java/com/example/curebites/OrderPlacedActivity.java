package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OrderPlacedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_placed);

        Button trackBtn = findViewById(R.id.trackBtn);

        trackBtn.setOnClickListener(v -> {
            Intent intent = new Intent(OrderPlacedActivity.this, OrderTrackingActivity.class);
            startActivity(intent);
        });
    }
}