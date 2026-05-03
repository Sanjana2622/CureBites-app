package com.example.curebites;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        // Back arrow → finish() closes this screen
        // and automatically returns to HomeActivity
        findViewById(R.id.ivBack).setOnClickListener(v -> finish());
    }
}