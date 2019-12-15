package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class biometrics extends AppCompatActivity {

    private RadioGroup radiogenderGroup;
    private RadioGroup category;
    private RadioButton radioSexButton;
    private RadioButton radiocategory;

    private Button btnDisplay;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biometrics);
        sharedpreferences = getSharedPreferences("details", Context.MODE_PRIVATE);


        EditText name = (EditText) findViewById(R.id.name);
        String nameS = name.getText().toString();

        EditText age = (EditText) findViewById(R.id.age);
        String ageS = age.getText().toString();

        EditText weight = (EditText) findViewById(R.id.weight);
        String weightS = weight.getText().toString();

        EditText height = (EditText) findViewById(R.id.height);
        String heightS = height.getText().toString();

       final  SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("name", nameS);
        editor.putString("age", ageS);
        editor.putString("weight", weightS);
        editor.putString("height", heightS);

        editor.apply();



         Button login = (Button) findViewById(R.id.next1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(biometrics.this,
                        target.class);

                startActivity(i);
                finish();
            }
        });






    }
}
