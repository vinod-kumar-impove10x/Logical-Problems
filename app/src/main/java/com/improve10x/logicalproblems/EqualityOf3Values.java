package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityEqulityOf3ValuesBinding;

public class EqualityOf3Values extends AppCompatActivity {

    private ActivityEqulityOf3ValuesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEqulityOf3ValuesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Equality Of 3 Values");
        threeNumEquality();
    }

    public void threeNumEquality() {
        binding.submitBtn.setOnClickListener(v -> {
            String noOne = binding.valueOneTxt.getText().toString();
            String noTwo = binding.valueTwoTxt.getText().toString();
            String noThree = binding.valueThreeTxt.getText().toString();
            int one = Integer.valueOf(noOne);
            int two =Integer.valueOf(noTwo);
            int three = Integer.valueOf(noThree);
            int result = equalityOfThreeNum(one, two, three);
            String finalResult = String.valueOf(result);
            binding.resultTxt.setText(finalResult);
        });
    }

    public static int equalityOfThreeNum(int a, int b, int c) {
        int result = 0;
        if (a == b && c == b) {
            result = 3;
        } else if (a == b || a == c || b == c) {
            result = 2;
        }
        System.out.println(result);
        return result;
    }
}