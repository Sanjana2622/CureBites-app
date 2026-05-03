package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * CartActivity
 *
 * Shows the cart with meal items and order summary.
 * - Back arrow (← My Cart) → returns to MealPlanActivity
 * - Proceed to Checkout button → shows toast for now
 * - Bottom nav → connects to all main screens
 */
public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // ── Back arrow ─────────────────────────────────────────────
        // "← My Cart 🛒" returns to MealPlanActivity
        findViewById(R.id.tvBack).setOnClickListener(v -> finish());

        // ── Proceed to Checkout button ─────────────────────────────
        // TODO: connect to checkout/payment screen when built
        findViewById(R.id.btn_proceed).setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this, CheckoutActivity.class);
            startActivity(intent);
        });

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

