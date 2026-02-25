package com.example.padhaihonedo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;

public class CubeMainActivity4 extends AppCompatActivity {
    private TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube_main4);
        textView =findViewById(R.id.textView);

        StringBuilder sb =new StringBuilder();
        for(int i=1;i<=200 ;i++){
            sb.append(i + " \u00B3  = " + i*i*i+ "\n");
        }
        textView.setText(sb.toString());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}