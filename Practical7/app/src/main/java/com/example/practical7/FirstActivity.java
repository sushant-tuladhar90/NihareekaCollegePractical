package com.example.practical7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity {

    private TextView tvResult;
    private Button btnOpenSecond;

    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        tvResult = findViewById(R.id.tvResult);
        btnOpenSecond = findViewById(R.id.btnOpenSecond);

        btnOpenSecond.setOnClickListener(view -> {

            Intent intent = new Intent(
                    FirstActivity.this,
                    SecondActivity.class
            );

            startActivityForResult(
                    intent,
                    REQUEST_CODE
            );
        });
    }

    @Override
    protected void onActivityResult(
            int requestCode,
            int resultCode,
            Intent data) {

        super.onActivityResult(
                requestCode,
                resultCode,
                data
        );

        if (requestCode == REQUEST_CODE) {

            if (resultCode == RESULT_OK && data != null) {

                String message =
                        data.getStringExtra("message");

                tvResult.setText(
                        "Message from Second Activity:\n"
                                + message
                );
            }
        }
    }
}