package com.example.myapplication;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Login ;
    private EditText Password;
    private EditText Username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button)findViewById(R.id.login);
        Username =(EditText) findViewById(R.id.editTextusername);
        Password =(EditText) findViewById(R.id.editTextpassword);
        Login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent3 = new Intent(MainActivity.this , ListActivity.class);
        startActivity(intent3);

    }
}
