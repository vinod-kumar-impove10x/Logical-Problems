package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button farmProbBtn = findViewById(R.id.farm_prob_btn);
        farmProbBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, FarmProblemActivity.class);
            startActivity(intent);
        });


        Button divisibleBtn = findViewById(R.id.divisible_btn);
        divisibleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, IsDivisibleByFive.class);
            startActivity(intent);
        });

        Button findDiscountBtn = findViewById(R.id.find_dicount_btn);
        findDiscountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheDiscount.class);
            startActivity(intent);
        });

        Button nthEvenNumberBtn = findViewById(R.id.nth_even_number_btn);
        nthEvenNumberBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NthEvenNumberActivity.class);
            startActivity(intent);
        });

        Button equalityOf3ValuesBtn = findViewById(R.id.equality_of3_values_btn);
        equalityOf3ValuesBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, EqualityOf3Values.class);
            startActivity(intent);
        });

        Button findTheBombBtn = findViewById(R.id.find_the_bomb_btn);
        findTheBombBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheBomb.class);
            startActivity(intent);
        });
    }
}