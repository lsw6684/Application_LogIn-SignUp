package com.example.hw10;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
    Button bt_register;
    EditText email2, password2;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.joinactivity);
        setTitle("20110118_이승원");
        bt_register = (Button) findViewById(R.id.bt_register);
        email2 = (EditText) findViewById(R.id.email2);
        password2 = (EditText) findViewById(R.id.password2);
        bt_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                outIntent.putExtra("em", email2.getText().toString());
                outIntent.putExtra("pw", password2.getText().toString());
                setResult(RESULT_OK, outIntent);
                startActivity(outIntent);
                finish();
            }
        });
    }
}