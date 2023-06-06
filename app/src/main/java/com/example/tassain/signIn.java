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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class signIn extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword;
    EditText editDogName, editDogAge, editDogBreed, editOwnerName, editAddress, editNumber;
    Button btnSignUp;
    FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressSignIn);
        editTextEmail = findViewById(R.id.emailSignIn);
        editTextPassword = findViewById(R.id.passwordSignIn);
        btnSignUp = findViewById(R.id.btnSignInIn);
        editDogName = findViewById(R.id.dog_name);
        editDogAge = findViewById(R.id.dog_age);
        editDogBreed = findViewById(R.id.dog_breed);
        editOwnerName = findViewById(R.id.owner_name);
        editAddress = findViewById(R.id.owner_address);
        editNumber = findViewById(R.id.owner_number);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);

                String email, password, dogName, age, breed, ownerName, address, number;
                email = editTextEmail.getText().toString();
                password = editTextPassword.getText().toString();
                dogName = editDogName.getText().toString();
                age = editDogAge.getText().toString();
                breed = editDogBreed.getText().toString();
                ownerName = editOwnerName.getText().toString();
                address = editAddress.getText().toString();
                number = editNumber.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(signIn.this,"skriv in din mail", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    Toast.makeText(signIn.this,"skriv in ditt lösenord", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(dogName)){
                    Toast.makeText(signIn.this,"skriv in dn hunds namn", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(age)){
                    Toast.makeText(signIn.this,"skriv in din hunds ålder", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(breed)){
                    Toast.makeText(signIn.this,"skriv in din hunds ras", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(ownerName)){
                    Toast.makeText(signIn.this,"skriv in ditt namn", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(address)){
                    Toast.makeText(signIn.this,"skriv in din adress", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(number)){
                    Toast.makeText(signIn.this,"skriv in ditt nummer", Toast.LENGTH_SHORT).show();
                    return;
                }



                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(signIn.this, "Konto skapat.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent minaSidor = new Intent(getApplicationContext(), MinaSidor.class);
                                    startActivity(minaSidor);


                                } else {
                                    Toast.makeText(signIn.this, "Registrering misslyckades.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });
    }
}