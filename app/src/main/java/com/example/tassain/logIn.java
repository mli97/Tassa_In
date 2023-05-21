package com.example.tassain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {

    EditText editMail, editPassword;
    Button btnLogInIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editMail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);

        btnLogInIn = findViewById(R.id.btnLogInIn);



    }
}