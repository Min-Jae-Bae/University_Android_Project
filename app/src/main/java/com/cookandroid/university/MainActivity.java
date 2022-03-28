package com.cookandroid.university;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtnView;
    CheckBox Mycheck1, Mycheck2, Mycheck3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mycheck1 = (CheckBox) findViewById(R.id.enable);
        Mycheck2 = (CheckBox) findViewById(R.id.clickable);
        Mycheck3 = (CheckBox) findViewById(R.id.rotate);
        BtnView = (Button) findViewById((R.id.button1));

        Mycheck1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(Mycheck1.isChecked() == true) {
                BtnView.setEnabled(true);

            } else {
                BtnView.setEnabled(false);
                }
        });

        Mycheck2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(Mycheck1.isChecked() == true) {
                BtnView.setClickable(true);

            } else {
                BtnView.setClickable(false);
            }
        });

        Mycheck3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(Mycheck1.isChecked() == true) {
                BtnView.setRotation(45);

            } else {
                BtnView.setRotation(0);
            }
        });


    }
}