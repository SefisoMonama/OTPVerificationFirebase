package com.example.otpverificationwithfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.otpverificationwithfirebase.databinding.ActivitySendOtpBinding;

public class SendOTP extends AppCompatActivity {

    private ActivitySendOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySendOtpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setupUi();
        setContentView(view);
    }

    private void setupUi() {


    }

}