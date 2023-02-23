package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityFizzBuzzBinding;

public class FizzBuzzActivity extends AppCompatActivity {
    private ActivityFizzBuzzBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Fizz Buzz");
        fizzBuzz();
    }

    public void fizzBuzz() {
        binding.checkBtn.setOnClickListener(v -> {
            String numberTxt = binding.inputNumTxt.getText().toString();
            int number = Integer.valueOf(numberTxt);
            String result = findFizzBuzz(number);
            binding.resultTxt.setText(result);

        });
    }

    public static String findFizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = "Integer.toString";
        }
        System.out.println(result);
        return result;
    }
}