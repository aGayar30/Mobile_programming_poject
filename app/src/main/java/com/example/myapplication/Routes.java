package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Routes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);

        // Find the ImageButtons by their IDs
        ImageButton cartButton = findViewById(R.id.cartButton);
        ImageButton ordersButton = findViewById(R.id.ordersButton);

        // Set click listeners for the ImageButtons
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CheckoutActivity when button 1 is clicked
                Intent intent = new Intent(Routes.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });

        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to HistoryActivity when button 2 is clicked
                Intent intent = new Intent(Routes.this, HistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
