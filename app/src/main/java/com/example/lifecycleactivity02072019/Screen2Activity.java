package com.example.lifecycleactivity02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Screen2Activity extends AppCompatActivity {

    Button btnScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        Log.d("BBB","Screen 2 : onCreate");
        btnScreen2 = findViewById(R.id.buttonScreen2);
        btnScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screen2Activity.this,Screen3Activity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 2 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Screen 2 : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Screen 2 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Screen 2 : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Screen 2 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Screen 2 : onDestroy");
    }
}
