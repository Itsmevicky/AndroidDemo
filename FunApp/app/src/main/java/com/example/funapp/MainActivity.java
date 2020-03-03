package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText searchField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchField = findViewById(R.id.inputToSearch);
    }


    public void send_data(View view) {
        Intent it = new Intent(this,ReceiveDataActivity.class);

        //Pass Array
        int arr[] = {100,200,300};
        it.putExtra("array",arr);

        //Pass ArrayList

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        it.putExtra("arr",al);

        startActivity(it);
    }

    public void calculator(View view) {
        Intent calc = new Intent(this,Calculator.class);
        startActivity(calc);
    }

    public void calculate_charges(View view) {
        Intent fairCalulation = new Intent(this,fairCalculation.class);

        int trainNo = Integer.parseInt(searchField.getText().toString());

        fairCalulation.putExtra("train", trainNo);
        startActivity(fairCalulation);
    }

    public void web_view(View view) {
        Intent webview = new Intent(this,WebviewActivity.class);
        startActivity(webview);
    }

    public void check_box(View view) {
        Intent check_box = new Intent(this,CheckBoxExample.class);
        startActivity(check_box);
    }

    public void tours_and_travels(View view) {
        Intent tours_and_travels = new Intent(this, ToursAndTravels.class);
        startActivity(tours_and_travels);
    }

    public void shared_pref(View view) {
        Intent shared_pref = new Intent(this,sharedPreference.class);
        startActivity(shared_pref);
    }

    public void pizza_ordering(View view) {
        Intent pizza_ordering = new Intent(this,Pizza_ordering.class);
        startActivity(pizza_ordering);
    }
}
