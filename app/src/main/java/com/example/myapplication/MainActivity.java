package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the login button by its ID
        Button loginButton = findViewById(R.id.buttonLogin);

        // Set a click listener on the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When the button is clicked, start the RoutesActivity
                Intent intent = new Intent(MainActivity.this, Routes.class);
                startActivity(intent);
            }
        });
    }
}
