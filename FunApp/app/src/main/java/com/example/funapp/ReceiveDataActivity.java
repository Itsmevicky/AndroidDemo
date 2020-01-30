package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ReceiveDataActivity extends AppCompatActivity {

    TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data);
        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);

        Intent it1 = getIntent();

        String str2 = "The Values are: ";
        ArrayList<Integer> al = it1.getIntegerArrayListExtra("arr");
        for(int i : al){
            str2 = str2 + i + "\t";
        }
        textView2.setText(str2);

        String str = "The values are: ";
        int arr1[] = it1.getIntArrayExtra("array");
        for(int i = 0; i< arr1.length; i++){
            str = str +" "+arr1[i];
        }
        textView1.setText(str);
    }
}
