package com.example.trafficlightjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.root_layout);
        mInfoTextView = findViewById(R.id.textView);

        // Назначаем этот класс обработчиком для всех трёх кнопок
        Button buttonRed = findViewById(R.id.red_button);
        Button buttonYellow = findViewById(R.id.yellow_button);
        Button buttonGreen = findViewById(R.id.green_button);

        buttonRed.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.red_button) {
            mInfoTextView.setText(R.string.red);
            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
        } else if (id == R.id.yellow_button) {
            mInfoTextView.setText(R.string.yellow);
            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
        } else if (id == R.id.green_button) {
            mInfoTextView.setText(R.string.green);
            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
        }
    }
}