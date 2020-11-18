package com.example.choosecolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColor);
    }

    public void showColor(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        Intent intent = new Intent(this, ChoosenColorActivity.class);
        intent.putExtra("color", position);
        startActivity(intent);
    }
}