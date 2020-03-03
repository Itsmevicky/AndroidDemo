package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Pizza_ordering extends AppCompatActivity {

    CheckBox farmhouse, mexican_veg, deluxe_veg;
    RadioButton etyes, etno, ecyes,ecno;
    TextView finalTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_ordering);

        farmhouse = findViewById(R.id.farmhouse);
        mexican_veg = findViewById(R.id.mexican_veg);
        deluxe_veg = findViewById(R.id.deluxe_veg);
        etyes = findViewById(R.id.etyes);
        etno = findViewById(R.id.etno);
        ecyes = findViewById(R.id.ecyes);
        ecno = findViewById(R.id.ecno);
        finalTotal = findViewById(R.id.total);

    }

    public void calculate_bill(View view) {

        int total =  0;
        if(farmhouse.isChecked()){
            total += 150;
        }
        if(mexican_veg.isChecked()){
            total += 250;
        }
        if(deluxe_veg.isChecked()){
            total += 350;
        }
        if (etyes.isChecked()){
            total += 50;
        }
        if(ecyes.isChecked()){
            total += 60;
        }
        finalTotal.setText("Total Bill = "+ total);
    }
}
