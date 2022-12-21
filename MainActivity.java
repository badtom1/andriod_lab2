package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    Button aButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=findViewById(R.id.switch1);
        aButton=findViewById(R.id.button);
        aButton.setEnabled(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ConstraintLayout cn = findViewById(R.id.line1);
        CalendarView cl = new CalendarView(this);
        cn.addView(cl);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()){
                    cn.removeView(cl);
                    aButton.setEnabled(true);
                    Toast.makeText(MainActivity.this,"Checked" , Toast.LENGTH_SHORT).show();

                }
                else{
                    cn.addView(cl);
                    aButton.setEnabled(false);
                    Toast.makeText(MainActivity.this,"NOTChecked" , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
