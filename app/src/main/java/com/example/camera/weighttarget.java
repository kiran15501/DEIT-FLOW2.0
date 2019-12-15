package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weighttarget extends AppCompatActivity {

    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weighttarget);


        sharedpreferences = getSharedPreferences("details", Context.MODE_PRIVATE);

        final  SharedPreferences.Editor editor = sharedpreferences.edit();

        Button gain = (Button) findViewById(R.id.gain);
        gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               editor.putString("weight target", "Gain");
                editor.apply();
               Intent i=new Intent(weighttarget.this,
                        target.class);

                startActivity(i);
                finish();
            }
        });


        Button lose = (Button) findViewById(R.id.lose);
        lose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("weight target", "Lose");
                editor.apply();
                Intent i=new Intent(weighttarget.this,
                        target.class);

                startActivity(i);
                finish();
            }
        });


    }
}
