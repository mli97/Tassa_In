package com.example.tassain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tassain.databinding.ActivityProfileBinding;
import com.google.firebase.ktx.Firebase;

public class profile_activity extends AppCompatActivity {


    Button save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }
}