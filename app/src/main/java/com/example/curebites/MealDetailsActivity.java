package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MealDetailsActivity
 *
 * Shows the full recipe detail for a selected meal.
 * - Back arrow → returns to MealPlanActivity (Monthly Meal Plan)
 * - Bottom nav → connects to all main screens
 */
public class MealDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_details);

        // ── Back arrow ─────────────────────────────────────────────
        // Returns to MealPlanActivity (Monthly Meal Plan)
        findViewById(R.id.tvBack).setOnClickListener(v -> finish());

        // ── Bottom navigation ──────────────────────────────────────
        setupBottomNav();
    }

    /**
     * setupBottomNav()
     * Wires all 4 bottom navigation tabs.
     */
    private void setupBottomNav() {

        // Home tab → goes to HomeActivity
        LinearLayout tabHome = findViewById(R.id.tabHome);
        tabHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        // Plans tab → goes to HealingPlanActivity
        LinearLayout tabPlans = findViewById(R.id.tabPlans);
        tabPlans.setOnClickListener(v -> {
            Intent intent = new Intent(this, HealingPlanActivity.class);
            startActivity(intent);
        });

        // Progress tab → goes to MyProgressActivity
        LinearLayout tabProgress = findViewById(R.id.tabProgress);
        tabProgress.setOnClickListener(v -> {
            Intent intent = new Intent(this, MyprogressActivity.class);
            startActivity(intent);
        });

        // Profile tab → goes to ProfileActivity
        LinearLayout tabProfile = findViewById(R.id.tabProfile);
        tabProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}