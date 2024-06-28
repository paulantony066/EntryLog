package com.example.entrylog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText a1,a2;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        a1 = (EditText)findViewById(R.id.uname);
        a2 = (EditText)findViewById(R.id.pass);
        b1 = (AppCompatButton)findViewById(R.id.logbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = a1.getText().toString();
                    String s2 = a2.getText().toString();
                    if (s1.equals("admin") && s2.equals("12345")) {
                        Intent i = new Intent(getApplicationContext(), LogEntry.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_SHORT).show();
                    }

                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "invalid ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}