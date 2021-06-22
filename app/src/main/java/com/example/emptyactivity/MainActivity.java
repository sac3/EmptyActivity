package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Life cycle event","In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle event","In onStart");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle event","In onPause");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Life cycle event","In onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle event","In onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle event","In onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle event","In onRestart");

    }
}