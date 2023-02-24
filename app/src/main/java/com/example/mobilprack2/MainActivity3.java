package com.example.mobilprack2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    EditText ThirdActivityEditText = (EditText) findViewById(R.id.ThirdActivityeditTextTextPersonName4);
    TextView ThirdActivityTextView = (TextView) findViewById(R.id.ThirdActivitytextView2);
    ImageView ThirdActivityImageView = (ImageView) findViewById(R.id.ThirdActivityimageView);
    Button ThirdActivityButton = (Button) findViewById(R.id.ThirdActivitybutton4);
}