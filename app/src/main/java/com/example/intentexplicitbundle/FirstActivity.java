package com.example.intentexplicitbundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText name;
    EditText address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        name = (EditText) findViewById(R.id.name);
        address = (EditText)findViewById(R.id.address);
        i.putExtra("Value1", name.getText().toString());
        i.putExtra("Value2", address.getText().toString());
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}