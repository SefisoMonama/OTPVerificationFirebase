package com.example.otpverificationwithfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

        //onclick listener on get otp button
        binding.getOTPButton.setOnClickListener(view -> {

            if (binding.inputMobileEditText.getText().toString().trim().isEmpty()){
                Toast.makeText(SendOTP.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(getApplicationContext(), VerifyOTPActivity.class);
            intent.putExtra("mobile", binding.inputMobileEditText.getText().toString());
            startActivity(intent);

        });

    }

}