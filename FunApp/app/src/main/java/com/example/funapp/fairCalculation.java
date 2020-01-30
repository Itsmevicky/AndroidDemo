package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class fairCalculation extends AppCompatActivity {

    TextView trainNo, trainName, source, destination, sleeperClassFair,resultHere;
    EditText noOfAdult, noOfChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fair_calculation);

        trainNo = findViewById(R.id.trainNoField);
        trainName = findViewById(R.id.trainNameField);
        source = findViewById(R.id.sourceField);
        destination = findViewById(R.id.destinationField);
        sleeperClassFair = findViewById(R.id.sleeperClassField);


        Intent it = getIntent();

        String data = String.valueOf(it.getIntExtra("train", 15707));

        trainNo.setText(data);
        trainName.setText("Amarpali Express");
        source.setText("Amritsar");
        destination.setText("Katihar");
        sleeperClassFair.setText("Rs. 500");
    }

    public void calculateCharge(View view) {

        noOfAdult = findViewById(R.id.adultsNo);
        noOfChild = findViewById(R.id.kidsNo);

        int adultsCount, childsCount;


        adultsCount = Integer.parseInt(noOfAdult.getText().toString());        childsCount = Integer.parseInt(noOfChild.getText().toString());

        int totalFairCharge = (500 * adultsCount) + (250 * childsCount);

        resultHere = findViewById(R.id.charge);
        resultHere.setText("The total fair is : Rs. "+ totalFairCharge);

    }
}
