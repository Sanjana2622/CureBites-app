package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NutritionistActivity extends AppCompatActivity {

    // Tracks which slot is currently selected
    private TextView selectedSlot = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritionist);

        // ── Back arrow → returns to HomeActivity ───────────────────
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // ── Time slot selection ────────────────────────────────────
        setupSlots();

        // ── Chat button → opens ChatNutritionistActivity ───────────
        Button btnChat = findViewById(R.id.btnChat);
        btnChat.setOnClickListener(v -> {
            Intent intent = new Intent(this, ChatNutritionistActivity.class);
            startActivity(intent);
        });

        // ── Bottom navigation ──────────────────────────────────────
        setupBottomNav();
    }

    /**
     * setupSlots()
     * Handles time slot selection.
     * Tapped slot turns green, previously selected turns gray.
     */
    private void setupSlots() {
        TextView slot1 = findViewById(R.id.slot1);
        TextView slot2 = findViewById(R.id.slot2);
        TextView slot3 = findViewById(R.id.slot3);
        TextView slot4 = findViewById(R.id.slot4);
        TextView slot5 = findViewById(R.id.slot5);
        TextView slot6 = findViewById(R.id.slot6);

        TextView[] allSlots = {slot1, slot2, slot3, slot4, slot5, slot6};

        // slot2 is selected by default (green in XML)
        selectedSlot = slot2;

        for (TextView slot : allSlots) {
            slot.setOnClickListener(v -> {
                // Reset previously selected slot to gray
                if (selectedSlot != null) {
                    selectedSlot.setBackgroundResource(R.drawable.gray_circle);
                    selectedSlot.setTextColor(
                            getResources().getColor(R.color.grey_text, null));
                }

                // Highlight newly tapped slot green
                selectedSlot = (TextView) v;
                selectedSlot.setBackgroundResource(R.drawable.green_circle);
                selectedSlot.setTextColor(
                        getResources().getColor(android.R.color.white, null));

                Toast.makeText(this,
                        "Slot selected: " + selectedSlot.getText(),
                        Toast.LENGTH_SHORT).show();
            });
        }
    }

    /**
     * setupBottomNav()
     * Wires the 4 bottom navigation tabs.
     */
    private void setupBottomNav() {

        // Home tab → goes to HomeActivity
        LinearLayout navHome = findViewById(R.id.navHome);
        navHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        // Plans tab → goes to HealingPlanActivity
        LinearLayout navPlans = findViewById(R.id.navPlans);
        navPlans.setOnClickListener(v -> {
            Intent intent = new Intent(this, HealingPlanActivity.class);
            startActivity(intent);
        });

        // Progress tab → goes to MyProgressActivity
        LinearLayout navProgress = findViewById(R.id.navProgress);
        navProgress.setOnClickListener(v -> {
            Intent intent = new Intent(this, MyprogressActivity.class);
            startActivity(intent);
        });

        // Profile tab → goes to ProfileActivity
        LinearLayout navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}