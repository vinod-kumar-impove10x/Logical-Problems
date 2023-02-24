package com.improve10x.logicalproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.logicalproblems.databinding.ActivityNameGreetingBinding;

public class NameGreetingActivity extends AppCompatActivity {
    private ActivityNameGreetingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNameGreetingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Hello Name Greeting");
        nameGreeting();
    }
    public void nameGreeting() {
        binding.submitBtn.setOnClickListener(v -> {
            String inPuText = binding.inputTxt.getText().toString();
            String result = helloNameGreeting(inPuText);
            binding.resultTxt.setText(result);
        });
    }


    public static String helloNameGreeting(String name) {
        String greetingHelloName = "Hello " + name + "!";
        System.out.println(greetingHelloName);
        return greetingHelloName;
    }
}