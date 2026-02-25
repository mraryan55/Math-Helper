package com.example.padhaihonedo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private Button button1,button2,button0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.button0);
        button2=findViewById(R.id.button2);
        button1=findViewById(R.id.button1);

        button0.setOnClickListener(view ->{
            Intent i = new Intent(MainActivity.this,TableMainActivity2.class);
            startActivity(i);
        });
        button1.setOnClickListener(view ->{
            Intent i = new Intent(MainActivity.this,SquareMainActivity3.class);
            startActivity(i);
        });
        button2.setOnClickListener(view ->{
            Intent i = new Intent(MainActivity.this,CubeMainActivity4.class);
            startActivity(i);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}