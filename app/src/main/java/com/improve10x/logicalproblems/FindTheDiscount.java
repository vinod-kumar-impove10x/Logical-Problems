package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityFindTheDiscountBinding;

public class FindTheDiscount extends AppCompatActivity {
    private ActivityFindTheDiscountBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find the discount");

        findDiscount();
    }

    public void findDiscount() {
        binding.submitBtn.setOnClickListener(v -> {
            String amount = binding.amountTxt.getText().toString();
            String discount = binding.discountTxt.getText().toString();
            int amo = Integer.valueOf(amount);
            int dis = Integer.valueOf(discount);
            int result = findTheFinalPrice(amo, dis);
            String finalPrice = String.valueOf(result);
            binding.finalPriceTxt.setText(finalPrice);
        });

    }

    public static int findTheFinalPrice(int originalPrice, int discountPercentage) {

        int finalPrice = originalPrice - (originalPrice * discountPercentage / 100);
        System.out.println(finalPrice);
        return finalPrice;
    }
}