package com.example.mobilprack2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.SetSchemaRequest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AirportActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_airport);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        ImageButton selectButton = findViewById(R.id.btn_menu_more);
        TextView text = findViewById(R.id.textView);
        text.setText(name);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name", text.getText());
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }

    //public void goBack(View v) {

      //  Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);

    //}
}