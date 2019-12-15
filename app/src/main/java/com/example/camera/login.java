package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedpreferences = getSharedPreferences("details", Context.MODE_PRIVATE);

        EditText username = (EditText) findViewById(R.id.username1);
        String usernameS = username.getText().toString();

        EditText password = (EditText) findViewById(R.id.password1);
        String passwordS = password.getText().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("username", usernameS);
        editor.putString("password", passwordS);

        editor.apply();

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(login.this,
                        biometrics.class);

                startActivity(i);
                finish();
            }
});
    }
}
