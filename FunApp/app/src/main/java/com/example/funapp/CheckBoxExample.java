package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBoxExample extends AppCompatActivity {

    CheckBox cb1,cb2,cb3;
    RadioGroup rg;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.Rb1);
        rb2 = findViewById(R.id.Rb2);

    }

    public void show_the_bill(View view) {
        int total =0;

        StringBuilder msg = new StringBuilder();
        msg.append("Selected items: ");
        if(cb1.isChecked()){
            total = total + 150;
            msg.append("\nSandwich : Rs 150");
        }
        if(cb2.isChecked()){
            total = total + 150;
            msg.append("\nBurger : Rs 150");
        }
        if(cb3.isChecked()){
            total = total + 150;
            msg.append("\nPizza : Rs 150");
        }
        msg.append("\nTotal is " + total);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void Rating(View view) {
        int id = rg.getCheckedRadioButtonId();
         
    }
}
