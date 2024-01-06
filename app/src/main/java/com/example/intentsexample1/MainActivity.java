package com.example.intentsexample1;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1;
    TextView textView;
    public int at3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et1);
        button1 = findViewById(R.id.act1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=editText.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}

