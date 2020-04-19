package com.example.projectview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOnClick = findViewById(R.id.btn_onclicklistener);
        Button btnLinear = findViewById(R.id.btn_linear);
        Button btnRelative = findViewById(R.id.btn_relative);
        Button btnTable = findViewById(R.id.btn_table);
        Button btnFrame = findViewById(R.id.btn_frame);
        Button btnConstraint = findViewById(R.id.btn_constrain);

        btnOnClick.setOnClickListener(this);
        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnConstraint.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_onclicklistener: {
                Intent intent = new Intent(this, OnClickListeners.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_linear: {
                Intent intent = new Intent(this, LinearLayout.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_relative: {
                Intent intent = new Intent(this, RelativeLayout.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_constrain: {
                Intent intent = new Intent(this, ConstraintLayout.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_table: {
                Intent intent = new Intent(this, TableLayout.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_frame: {
                Intent intent = new Intent(this, FrameLayout.class);
                startActivity(intent);
                break;
            }

        }

    }
}

































