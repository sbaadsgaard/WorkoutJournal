package com.baaden.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchWorkout(View view) {
        Toast toast = Toast.makeText(this, "Launched workout", Toast.LENGTH_SHORT);
        toast.show();
    }
}
