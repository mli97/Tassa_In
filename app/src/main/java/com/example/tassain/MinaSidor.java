package com.example.tassain;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class MinaSidor extends AppCompatActivity {

    Button button_change;
    int SELECT_PICTURE = 200;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_mina_sidor, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.loggaUt) {

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);

            startActivity(intent);

            finish();

            return true;
        }
        if (item.getItemId() == R.id.huvudSida) {

            Intent intent = new Intent(getApplicationContext(), huvudSida.class);

            startActivity(intent);

            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mina_sidor);

        button_change = findViewById(R.id.button);

        //mAuth.getCurrentUser().getUid();

        button_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(MinaSidor.this, profile_activity.class);
                startActivity(profile);
            }
        });


    }
}