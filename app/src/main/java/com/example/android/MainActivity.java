package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    private Button refreshButton;
    private Button cancelButton;
    private Button submitButton;
    private TextView textView;
    int count;

    public void count(View view){
        count++;
        textView.setText(""+count);
        Log.d(TAG,""+count);
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        refreshButton = findViewById(R.id.refreshButton);
//        cancelButton = findViewById(R.id.cancelButton);
//        textView = findViewById(R.id.textView);
//
//        refreshButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                count++;
//                textView.setText(""+count);
//                Log.d(TAG, msg: ""+count);
//
//            }
//        });
//
//
//
//        cancelButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                textView.setText("");
//            }
//        });
//
//        submitButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "This is a toast", Toast.LENGTH_LONG).show();
//            }
//        });



    }
