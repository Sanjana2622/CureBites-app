package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

/**
 * HomeActivity
 *
 * Main dashboard screen shown after user completes onboarding.
 * Connects to:
 *   - UploadReportActivity    (Upload reports text)
 *   - HealingPlanActivity     (Meal Plans card)
 *   - OrderHistoryActivity    (Orders card)
 *   - NutritionistActivity    (Experts card)
 *   - MyProgressActivity      (Progress card)
 *   - NotificationsActivity   (Bell icon)
 *   - MealPlanActivity        (Trial Pack button)
 *   - HealingPlanActivity     (Plans bottom tab)
 *   - MyProgressActivity      (Progress bottom tab)
 *   - ProfileActivity         (Profile bottom tab)
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // ── Bell/Notification icon ─────────────────────────────────
        // The 🔔 emoji TextView in the top right of the green header
        TextView tvNotification = findViewById(R.id.tvNotification);
        tvNotification.setOnClickListener(v -> {
            Intent intent = new Intent(this, NotificationsActivity.class);
            startActivity(intent);
        });

        // ── Upload Reports text ────────────────────────────────────
        // "Upload reports 📤" text in the green header
        TextView tvUploadReports = findViewById(R.id.tvUploadReports);
        tvUploadReports.setOnClickListener(v -> {
            Intent intent = new Intent(this, UploadReportActivity.class);
            startActivity(intent);
        });

        // ── Meal Plans card ────────────────────────────────────────
        // 🥗 card in the grid → goes to HealingPlanActivity
        CardView cardMealPlans = findViewById(R.id.cardMealPlans);
        cardMealPlans.setOnClickListener(v -> {
            Intent intent = new Intent(this, HealingPlanActivity.class);
            startActivity(intent);
        });

        // ── Orders card ────────────────────────────────────────────
        // 🛒 card in the grid → goes to OrderHistoryActivity
        CardView cardOrders = findViewById(R.id.cardOrders);
        cardOrders.setOnClickListener(v -> {
            Intent intent = new Intent(this, OrderHistoryActivity.class);
            startActivity(intent);
        });

        // ── Experts card ───────────────────────────────────────────
        // 👨‍⚕️ card in the grid → goes to NutritionistActivity
        CardView cardExperts = findViewById(R.id.cardExperts);
        cardExperts.setOnClickListener(v -> {
            Intent intent = new Intent(this, NutritionistActivity.class);
            startActivity(intent);
        });

        // ── Progress card ──────────────────────────────────────────
        // 📊 card in the grid → goes to MyProgressActivity
        CardView cardProgress = findViewById(R.id.cardProgress);
        cardProgress.setOnClickListener(v -> {
            Intent intent = new Intent(this, MyprogressActivity.class);
            startActivity(intent);
        });

        // ── Get Your Trial Pack button ─────────────────────────────
        // Big green button at the bottom → goes to MealPlanActivity
        findViewById(R.id.btnTrialPack).setOnClickListener(v -> {
            Intent intent = new Intent(this, MealPlanActivity.class);
            startActivity(intent);
        });

        // ── Bottom navigation bar ──────────────────────────────────
        setupBottomNav();
    }

    /**
     * setupBottomNav()
     *
     * Wires the 4 bottom navigation tabs.
     * Home tab is already active on this screen.
     */
    private void setupBottomNav() {

        // Home tab — already on this screen, do nothing
        // (no ID needed since we are already here)

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