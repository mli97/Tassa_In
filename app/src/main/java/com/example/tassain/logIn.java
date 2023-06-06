package com.example.tassain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class logIn extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword;
    Button btnLogIn;
    FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editTextEmail = findViewById(R.id.emailLogIn);
        editTextPassword = findViewById(R.id.passwordLogIn);
        mAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressSignIn);
        btnLogIn = findViewById(R.id.btnLogInIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String email, password;
                email = editTextEmail.getText().toString();
                password = editTextPassword.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(logIn.this,"skriv in din mail", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    Toast.makeText(logIn.this,"skriv in ditt lösenord", Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(logIn.this,"inloggningen lyckades", Toast.LENGTH_SHORT).show();
                                    Intent huvudSida = new Intent(getApplicationContext(), huvudSida.class);
                                    startActivity(huvudSida);

                                } else {
                                    Toast.makeText(logIn.this, "inoggningen misslyckades",
                                            Toast.LENGTH_SHORT).show();


                                }
                            }
                        });
            }
        });



     

    }
}