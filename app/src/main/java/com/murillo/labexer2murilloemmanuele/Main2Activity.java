package com.murillo.labexer2murilloemmanuele;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    EditText etInp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("VALIDATE");
        etInp = findViewById(R.id.editText3);
    }

    public void Ret(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void validate(View v){
        SharedPreferences sp =  getSharedPreferences("myData", MODE_PRIVATE);
        String course = sp.getString("Course 1", null);
        String course1 = sp.getString("Course 2", null);
        String course2 = sp.getString("Course 3", null);
        String course3 = sp.getString("Course 4", null);
        String course4 = sp.getString("Course 5", null);
        String course5 = sp.getString("Course 6", null);
        String course6 = sp.getString("Course 7", null);
        String course7 = sp.getString("Course 8", null);
        String inp = etInp.getText().toString();

        if(inp.equals(course)|| inp.equals(course1)|| inp.equals(course2)|| inp.equals(course3)|| inp.equals(course4)|| inp.equals(course5)|| inp.equals(course6)|| inp.equals(course7) ){
            Toast.makeText(this, "Valid Course.",Toast.LENGTH_LONG).show();}
        else{
            Toast.makeText(this,"Invalid Course.",Toast.LENGTH_LONG).show();
        }
        }
    }


