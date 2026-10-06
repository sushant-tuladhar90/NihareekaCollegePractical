package com.example.practical7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    private EditText etMessage;
    private Button btnSendBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        etMessage = findViewById(R.id.etMessage);
        btnSendBack = findViewById(R.id.btnSendBack);

        btnSendBack.setOnClickListener(view -> {

            String message =
                    etMessage.getText().toString();

            Intent resultIntent = new Intent();

            resultIntent.putExtra(
                    "message",
                    message
            );

            setResult(
                    RESULT_OK,
                    resultIntent
            );

            finish();
        });
    }
}