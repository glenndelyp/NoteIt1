package com.example.noteit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ImageButton imgButton;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent=new Intent(MainActivity.this,HomePage.class);
                 startActivity(intent);
            }
        });

        imgButton = (ImageButton)  findViewById(R.id.imageButton);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });


    }
}