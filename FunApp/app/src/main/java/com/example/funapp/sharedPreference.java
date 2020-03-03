package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class sharedPreference extends AppCompatActivity {

    EditText et1, et2;
    CheckBox cb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        cb1 = findViewById(R.id.cb1);

    }

    public void save_data(View view) {
        if(cb1.isChecked()){
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor= sp.edit();
            String username = et1.getText().toString();
            String password = et2.getText().toString();
            editor.putString("username",username);
            editor.putString("password",password);
            editor.commit();
            et1.setText("");
            et2.setText("");

        }else{
            Toast.makeText(this, "Please check the remember me checkbox if you want to save username and password", Toast.LENGTH_SHORT).show();
        }
    }

    public void read_data(View view) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String username = sharedPreferences.getString("username","No Username");
        String password = sharedPreferences.getString("password","No Password");
        et1.setText(username);
        et2.setText(password);
        Toast.makeText(this, "Username : "+username+"\nPassword : "+password, Toast.LENGTH_SHORT).show();
    }

    public void clear_data(View view) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove("username");
        editor.remove("password");
        et1.setText("");
        et2.setText("");

        //editor.clear(); //if you want to clear all data at once
        editor.commit();
    }
}
