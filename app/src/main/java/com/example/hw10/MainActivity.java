package com.example.hw10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText email, password;

    TextView tv2;
    Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_login = (Button) findViewById(R.id.bt_login);
        tv2 = (TextView) findViewById(R.id.tv2);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        Intent intent = getIntent();
        String em = intent.getStringExtra("em");
        String pw = intent.getStringExtra("pw");

        email.setText(em);
        password.setText(pw);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                startActivity(intent);

            }
        });
    }

}