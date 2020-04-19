package com.example.projectview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OnClickListeners extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click_listeners);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1 :
                Toast.makeText(this, "Button 1 diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn2 :
                Toast.makeText(this, "Button 2 diklik", Toast.LENGTH_SHORT).show();
        }

    }
}
