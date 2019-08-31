package com.example.lifecycleactivity02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Screen3Activity extends AppCompatActivity {
    Button btnScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Log.d("BBB","Screen 3 : onCreate");
        btnScreen3 = findViewById(R.id.buttonScreen3);
        btnScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen3Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 3 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Screen 3 : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Screen 3 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Screen 3 : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Screen 3 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Screen 3 : onDestroy");
    }
}
