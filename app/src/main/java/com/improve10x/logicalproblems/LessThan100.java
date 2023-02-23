package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityLessThan100Binding;

public class LessThan100 extends AppCompatActivity {
    private ActivityLessThan100Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLessThan100Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Less Than 100");
        lessThan100();
    }
    public void lessThan100() {
        binding.submitBtn.setOnClickListener(v -> {
            String one = binding.noOneTxt.getText().toString();
            String two = binding.noTwoTxt.getText().toString();
            int noOne = Integer.valueOf(one);
            int noTwo = Integer.valueOf(two);
            boolean result = isLessThan100(noOne, noTwo);
            binding.resultTxt.setText(String.valueOf(result));
        });
    }


    public  static boolean isLessThan100(int a, int b) {
        boolean result = false;
        if (a + b < 100) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}