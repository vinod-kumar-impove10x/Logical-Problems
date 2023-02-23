package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityFindTheBombBinding;

public class FindTheBomb extends AppCompatActivity {
    private ActivityFindTheBombBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheBombBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find The Bomb");
        theBomb();
    }

    public void theBomb() {
        binding.submitBtn.setOnClickListener(v -> {
            String inputTxt = binding.inputTxt.getText().toString();
            String result = findTheBomb(inputTxt);
            binding.resultTxt.setText(result);
        });
    }

    public static String findTheBomb (String text) {
        try {
            String result = "";
            String lowerCaseText = text.toLowerCase();
            if (lowerCaseText.contains("bomb")) {
                result = "DUCK!";
            } else {
                result = "Relax, there’s no bomb.";
            }
            System.out.println(result);
            return result;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}