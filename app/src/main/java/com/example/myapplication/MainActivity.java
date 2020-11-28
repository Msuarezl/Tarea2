package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Inicio(View view)
    {
        EditText txtuser = (EditText) findViewById(R.id.user);
        EditText txtpass = (EditText) findViewById(R.id.pass);
        Intent intent = new Intent(MainActivity.this, Validation.class);
        Bundle b = new Bundle();
        b.putString("user", txtuser.getText().toString());
        b.putString("pass", txtpass.getText().toString());
        intent.putExtras(b);
        startActivity(intent);

    }
}