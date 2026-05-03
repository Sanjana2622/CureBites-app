package com.example.curebites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * TellUsActivity
 *
 * This screen collects basic user information:
 *   - Gender (Male / Female)
 *   - Age (SeekBar slider)
 *   - Current Weight (SeekBar slider)
 *   - Height (SeekBar slider)
 *   - Health Conditions (Type 2 Diabetes, Thyroid, PCOD, High Cholesterol)
 *
 * When Continue is tapped → goes to UploadReportActivity
 */
public class TellUsActivity extends AppCompatActivity {

    // ── SeekBar value display TextViews ────────────────────────────
    // These show the current number next to each slider
    private TextView tvAgeValue;
    private TextView tvWeightValue;
    private TextView tvHeightValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_us);

        // ── Bind TextViews that show slider values ─────────────────
        tvAgeValue    = findViewById(R.id.tvAgeValue);
        tvWeightValue = findViewById(R.id.tvWeightValue);
        tvHeightValue = findViewById(R.id.tvHeightValue);

        // ── Age SeekBar ────────────────────────────────────────────
        // Range: 1 to 100 years
        SeekBar seekAge = findViewById(R.id.seekAge);
        seekAge.setMax(100);
        seekAge.setProgress(28); // default age
        seekAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update the age text when slider moves
                tvAgeValue.setText(String.valueOf(progress));
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // ── Weight SeekBar ─────────────────────────────────────────
        // Range: 1 to 200 kg
        SeekBar seekWeight = findViewById(R.id.seekWeight);
        seekWeight.setMax(200);
        seekWeight.setProgress(72); // default weight
        seekWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update the weight text when slider moves
                tvWeightValue.setText(String.valueOf(progress));
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // ── Height SeekBar ─────────────────────────────────────────
        // Range: 50 to 250 cm
        SeekBar seekHeight = findViewById(R.id.seekHeight);
        seekHeight.setMax(250);
        seekHeight.setProgress(172); // default height
        seekHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update the height text when slider moves
                tvHeightValue.setText(String.valueOf(progress));
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // ── Continue button ────────────────────────────────────────────────
// Goes to HomeActivity
        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });
    }
}
