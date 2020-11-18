package com.example.choosecolor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChoosenColorActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosen_color);
        layout = findViewById(R.id.colorLayout);
        Intent intent = getIntent();
        position = intent.getIntExtra("color", 0);
        setBackground(position);
    }

    @SuppressLint("NewApi")
    private void setBackground(int position) {
        int[] colors = getResources().getIntArray(R.array.background);
        layout.setBackgroundColor(colors[position]);
    }
}