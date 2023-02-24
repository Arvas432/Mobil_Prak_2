package com.example.mobilprack2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText FirstActivityEditText = (EditText) findViewById(R.id.FirstActivityEditText);
    TextView FirstActivityTextView = (TextView) findViewById(R.id.FirstActivitytextView);
    ImageView FirstActivityImageView = (ImageView) findViewById(R.id.FirstActivityimageView);
    Button FirstActivityButton = (Button) findViewById(R.id.FirstActivitybutton);
}