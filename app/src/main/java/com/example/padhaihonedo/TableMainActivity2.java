package com.example.padhaihonedo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TableMainActivity2 extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView textView;
    private TextView textView2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_table_main2);

        seekBar=findViewById(R.id.seekBar);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);

        //seekBar.setMax(20);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    showTable(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void showTable (int table){
        StringBuilder sb =new StringBuilder();
        for(int i=1;i<=10;i++){
            sb.append(table).append(" X ").append(i).append(" = ").append(table*i).append("\n");
        }
        textView2.setText(sb.toString());
        textView.setText(" Multiplication Table Of " + table);


    }
}