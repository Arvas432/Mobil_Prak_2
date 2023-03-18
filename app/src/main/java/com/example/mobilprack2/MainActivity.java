package com.example.mobilprack2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        FirstActivitybutton.setText(R.string.button1);
        FirstActivityEditText = (EditText)findViewById(R.id.FirstActivityEditText);
        FirstActivityEditText.setText(R.string.Edittext_Text);
        FirstActivityTextView = (TextView)findViewById(R.id.FirstActivitytextView);
        FirstActivityTextView.setText(R.string.Text1);
        FirstActivityImageView = (ImageView)findViewById(R.id.FirstActivityimageView);
        FirstActivityImageView.setImageResource(R.drawable.floppa_icon);

        Intent intent = new Intent(this, AirportActivity.class);
        intent.putExtra("name",FirstActivityEditText.getText());
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Button pressed!");
                mStartForResult.launch(intent);

            }
        };
        FirstActivitybutton.setOnClickListener(listener);
    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>()
    {
        @Override
        public void onActivityResult(ActivityResult result)
        {
            FirstActivityTextView.setText(result.getData().getStringExtra("name"));

        }
    });
    public MainActivity() {

    }


    private Button FirstActivitybutton;
    private EditText FirstActivityEditText;
    private TextView FirstActivityTextView;
    private ImageView FirstActivityImageView;



}