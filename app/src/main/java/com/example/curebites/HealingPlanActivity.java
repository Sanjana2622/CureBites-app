package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * HealingPlanActivity
 *
 * This screen shows 4 meal plan options:
 *   1. Trial Pack      – 1 meal/day for 3 days
 *   2. Daily Meal Plan – all meals for a full day
 *   3. Weekly Plan     – all meals for 7 days
 *   4. Monthly Plan    – all meals for 30 days
 *
 * Back arrow → returns to HomeActivity
 * Get Started buttons → opens MealPlanActivity
 * Bottom nav → connects to all main screens
 */
public class HealingPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healing_plan);

        // ── Back arrow ─────────────────────────────────────────────
        // Returns to HomeActivity
        findViewById(R.id.ivBack).setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        // ── Cart icon ──────────────────────────────────────────────
        findViewById(R.id.ivCart).setOnClickListener(v ->
                Toast.makeText(this, "Cart coming soon!", Toast.LENGTH_SHORT).show());

        // ── Plan buttons ───────────────────────────────────────────
        // All 4 buttons open MealPlanActivity with the plan name
        Button btnTrial = findViewById(R.id.btnTrial);
        btnTrial.setOnClickListener(v -> onPlanSelected("Trial Pack"));

        Button btnDaily = findViewById(R.id.btnDaily);
        btnDaily.setOnClickListener(v -> onPlanSelected("Daily Meal Plan"));

        Button btnWeekly = findViewById(R.id.btnWeekly);
        btnWeekly.setOnClickListener(v -> onPlanSelected("Weekly Plan"));

        Button btnMonthly = findViewById(R.id.btnMonthly);
        btnMonthly.setOnClickListener(v -> onPlanSelected("Monthly Plan"));

        // ── Bottom navigation bar ──────────────────────────────────
        setupBottomNav();
    }

    /**
     * onPlanSelected(planName)
     *
     * Called when user taps "Get Started" on any plan card.
     * Navigates to MealPlanActivity and passes the plan name.
     *
     * @param planName  The name of the selected plan (e.g. "Weekly Plan")
     */
    private void onPlanSelected(String planName) {
        Intent intent = new Intent(this, MealPlanActivity.class);
        intent.putExtra("PLAN_NAME", planName);
        startActivity(intent);
    }

    /**
     * setupBottomNav()
     *
     * Wires all 4 bottom navigation tabs with real navigation.
     * "Plans" tab is active on this screen.
     */
    private void setupBottomNav() {

        // Home tab → goes to HomeActivity
        LinearLayout tabHome = findViewById(R.id.tabHome);
        tabHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        // Plans tab → already here, do nothing
        LinearLayout tabPlans = findViewById(R.id.tabPlans);
        tabPlans.setOnClickListener(v -> { });

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
