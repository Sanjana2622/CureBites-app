package com.example.curebites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Fix window insets for edge to edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnLoginAction), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Login button → goes to TellUsActivity
        Button btnLoginAction = findViewById(R.id.btnLoginAction);
        btnLoginAction.setOnClickListener(v -> {
            Intent intent = new Intent(this, TellUsActivity.class);
            startActivity(intent);
        });
    }
}