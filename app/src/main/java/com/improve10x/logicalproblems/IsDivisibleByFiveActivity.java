package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityIsDivisibleByFiveBinding;

public class IsDivisibleByFiveActivity extends AppCompatActivity {
   private ActivityIsDivisibleByFiveBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIsDivisibleByFiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("IsDivisibleByFive");

        isDivisible();
    }


    public void isDivisible() {
        binding.submitBtn.setOnClickListener(v -> {
            String num = binding.numberTxt.getText().toString();
            int number = Integer.valueOf(num);
            boolean result = isDivisibleByFive(number);
            String finalResult = String.valueOf(result);
            binding.resultTxt.setText(finalResult);
        });
    }

    public static boolean isDivisibleByFive(int n) {
        boolean result = false;
        if (n % 5 == 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}