package com.example.mobilprack2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    EditText SecondActivityEditText = (EditText) findViewById(R.id.SecondActivityeditTextTextPersonName2);
    TextView SecondActivityTextView = (TextView) findViewById(R.id.SecondActivitytextView3);
    ImageView SecondActivityImageView = (ImageView) findViewById(R.id.SecondActivityimageView);
    Button SecondActivityButton = (Button) findViewById(R.id.SecondActivitybutton2);
    public void ButtonOnClick(View view)
    {
        Log.d(TAG,"Button Pressed");
    }

}