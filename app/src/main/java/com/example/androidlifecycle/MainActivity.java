package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initial setup, such as setting up views and initial data
    }

    @Override
    protected void onStart() {
        super.onStart();
        // start or resume any processes that should occur when the activity becomes visible
        Toast.makeText(this, "OnStart Triggered", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // start or resume any processes that should occur when the activity becomes the foreground activity
        Toast.makeText(this, "OnResume Triggered", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // pause any processes that should not be running while the activity is in the background
        Toast.makeText(this, "OnPause Triggered", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // stop any processes that should not be running while the activity is not visible
        Toast.makeText(this, "OnStop Triggered", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // release any resources and clean up any data before the activity is destroyed
        Toast.makeText(this, "OnDestroy Triggered", Toast.LENGTH_SHORT).show();
    }
}
