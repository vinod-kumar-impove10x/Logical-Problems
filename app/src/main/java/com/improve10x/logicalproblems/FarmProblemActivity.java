package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.improve10x.logicalproblems.databinding.ActivityFarmProblemBinding;

public class FarmProblemActivity extends AppCompatActivity {
    private ActivityFarmProblemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFarmProblemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("FarmProblem");

        handleView();
    }

    private void handleView() {
        binding.countBtn.setOnClickListener(v -> {
            String chicken = binding.chickenLegsTxt.getText().toString();
            String cow = binding.cowLegsTxt.getText().toString();
            String pigs = binding.pigsLegsTxt.getText().toString();
            int noOfChicken = Integer.parseInt(chicken);
            int noOfCow = Integer.parseInt(cow);
            int noOfPigs = Integer.parseInt(pigs);
            int findLegs = findTotalLegs(noOfChicken, noOfCow, noOfPigs);
            String totalNoLegs = String.valueOf(findLegs);
            binding.totalLegsTxt.setText(totalNoLegs);

            Toast.makeText(this, String.valueOf(findLegs), Toast.LENGTH_SHORT).show();
        });
    }

    public static int findTotalLegs(int chickens, int cows, int pigs) {
       int chickenLegs = chickens * 2;
        int cowLegs = cows * 4;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + cowLegs + pigLegs;
        System.out.println(totalLegs);
        return totalLegs;
    }
}