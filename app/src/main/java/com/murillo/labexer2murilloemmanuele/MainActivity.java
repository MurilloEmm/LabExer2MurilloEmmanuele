package com.murillo.labexer2murilloemmanuele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etC,etC6,etC5,etC4,etC3,etC2,etC1,etC7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etC = findViewById(R.id.editText);
        etC7 = findViewById(R.id.editText4);
        etC6 = findViewById(R.id.editText7);
        etC5 = findViewById(R.id.editText5);
        etC4 = findViewById(R.id.editText6);
        etC3 = findViewById(R.id.editText10);
        etC2 = findViewById(R.id.editText8);
        etC1 = findViewById(R.id.editText9);
        setTitle("courses in ust");


    }
    public void Next(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void saveD(View v){
        SharedPreferences sp =  getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String course = etC.getText().toString();
        String course1 = etC1.getText().toString();
        String course2 = etC2.getText().toString();
        String course3 = etC3.getText().toString();
        String course4 = etC4.getText().toString();
        String course5 = etC5.getText().toString();
        String course6 = etC6.getText().toString();
        String course7 = etC7.getText().toString();
        editor.putString("Course 1", course);
        editor.putString("Course 2", course1);
        editor.putString("Course 3", course2);
        editor.putString("Course 4", course3);
        editor.putString("Course 5", course4);
        editor.putString("Course 6", course5);
        editor.putString("Course 7", course6);
        editor.putString("Course 8", course7);

        editor.commit();
        Toast.makeText(this, "Course Data was saved!", Toast.LENGTH_LONG).show();
    }

}
