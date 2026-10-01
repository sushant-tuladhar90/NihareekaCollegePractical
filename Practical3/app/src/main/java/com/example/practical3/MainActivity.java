package com.example.practical3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etEmail;
    EditText etPhone;
    EditText etAddress;

    Spinner spinnerGender;
    Spinner spinnerSemester;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Connect XML widgets with Java

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);

        spinnerGender = findViewById(R.id.spinnerGender);
        spinnerSemester = findViewById(R.id.spinnerSemester);

        btnSubmit = findViewById(R.id.btnSubmit);


        // Submit Button

        btnSubmit.setOnClickListener(view -> {

            // Get values from EditText

            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String address = etAddress.getText().toString();


            // Get selected values from Spinner

            String gender =
                    spinnerGender.getSelectedItem().toString();

            String semester =
                    spinnerSemester.getSelectedItem().toString();


            // Create Intent

            Intent intent =
                    new Intent(MainActivity.this, StudentDetailsActivity.class);


            // Pass data to next Activity

            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("phone", phone);
            intent.putExtra("gender", gender);
            intent.putExtra("semester", semester);
            intent.putExtra("address", address);


            // Open next Activity

            startActivity(intent);

        });
    }
}