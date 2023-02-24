package com.example.mobilprack2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstActivitybutton = (Button)findViewById(R.id.FirstActivitybutton);
        FirstActivityEditText = (EditText)findViewById(R.id.FirstActivityEditText);
        FirstActivityTextView = (TextView)findViewById(R.id.FirstActivitytextView);
        FirstActivityImageView = (ImageView)findViewById(R.id.FirstActivityimageView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Button pressed!");
            }
        };
        FirstActivitybutton.setOnClickListener(listener);
    }
    public MainActivity() {

    }


    private Button FirstActivitybutton;
    private EditText FirstActivityEditText;
    private TextView FirstActivityTextView;
    private ImageView FirstActivityImageView;



}