package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityNthEvenNumberBinding;

public class NthEvenNumberActivity extends AppCompatActivity {
     private ActivityNthEvenNumberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNthEvenNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Nth Even Number");

        evenNumber();
    }

    public void evenNumber() {
        binding.submitBtn.setOnClickListener(v -> {
            String num = binding.numberTxt.getText().toString();
            int number = Integer.valueOf(num);
            int result = nthEvenNumber(number);
            String finalResult= String.valueOf(result);
            binding.resultTxt.setText(finalResult);
        });
    }

    public static int nthEvenNumber(int n) {

        int evenNumber = 2 * n - 2;
        System.out.println(evenNumber);
        return evenNumber;
    }
}