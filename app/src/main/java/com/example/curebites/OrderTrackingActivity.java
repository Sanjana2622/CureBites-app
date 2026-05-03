package com.example.curebites;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

 public class OrderTrackingActivity extends AppCompatActivity {

    private static final String PARTNER_PHONE = "+919876543210";
    private static final String PARTNER_EMAIL = "ramkumar@delivery.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);

        // Back Button
        ImageView backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(OrderTrackingActivity.this, HomeActivity.class);

            // 🔥 THIS LINE MAKES IT ALWAYS GO TO HOME ONLY
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

            startActivity(intent);
        });

        // Call Button
        ImageView callBtn = findViewById(R.id.callBtn);
        callBtn.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:" + PARTNER_PHONE));
            startActivity(callIntent);
        });

        // Message Button
        ImageView msgBtn = findViewById(R.id.msgBtn);
        msgBtn.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + PARTNER_EMAIL));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Order Query");

            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            } else {
                Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show();
            }
        });
    }
}