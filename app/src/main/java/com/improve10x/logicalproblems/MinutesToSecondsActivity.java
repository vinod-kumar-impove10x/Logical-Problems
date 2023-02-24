package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityMinutesToSecondsBinding;

public class MinutesToSecondsActivity extends AppCompatActivity {
    private ActivityMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       getSupportActionBar().setTitle("MinutesToSeconds");
        minsToSecs();
    }

    public  void minsToSecs() {
        binding.convertBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int min = Integer.valueOf(minutes);
            int convert = convertMinsToSecs(min);
            String result = String.valueOf(convert);
            binding.secondsTxt.setText(result);
        });

    }

    public static int convertMinsToSecs(int minutes) {
        int seconds = minutes * 60;
        System.out.println(seconds);
        return seconds;
    }
}