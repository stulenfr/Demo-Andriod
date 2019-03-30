package com.camod.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText myTextFeild = (EditText) findViewById(R.id.myTextField);

        Toast.makeText(MainActivity.this, myTextFeild.getText().toString()+"!", Toast.LENGTH_LONG).show();

        Log.i("Info", myTextFeild.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
