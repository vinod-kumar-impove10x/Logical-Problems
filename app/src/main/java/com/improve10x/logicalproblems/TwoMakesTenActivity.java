package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity {
    private ActivityTwoMakesTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Is Two makes Ten");

        twoMakTen();
    }
     public void twoMakTen() {
        binding.submitBtn.setOnClickListener(v -> {
            String numOne = binding.noOneTxt.getText().toString();
            String numTwo = binding.noTwoTxt.getText().toString();
            int one = Integer.valueOf(numOne);
            int two = Integer.valueOf(numTwo);
            boolean result = twoMakesTen(one, two);
            String finalResult = String.valueOf(result);
            binding.resultTxt.setText(finalResult);
        });
     }

     public static boolean twoMakesTen(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a+b == 10) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}