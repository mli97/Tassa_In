package com.example.tassain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {

    EditText editMail, editPassword;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editMail = findViewById(R.id.emailLogIn);
        editPassword = findViewById(R.id.passwordLogIn);

        btnLogIn = findViewById(R.id.btnLogInIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;

            }
        });

    }
}