package com.example.practical3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentDetailsActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvEmail;
    TextView tvPhone;
    TextView tvGender;
    TextView tvSemester;
    TextView tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_student_details);


        // Connect XML widgets

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvGender = findViewById(R.id.tvGender);
        tvSemester = findViewById(R.id.tvSemester);
        tvAddress = findViewById(R.id.tvAddress);


        // Receive data from MainActivity

        String name =
                getIntent().getStringExtra("name");

        String email =
                getIntent().getStringExtra("email");

        String phone =
                getIntent().getStringExtra("phone");

        String gender =
                getIntent().getStringExtra("gender");

        String semester =
                getIntent().getStringExtra("semester");

        String address =
                getIntent().getStringExtra("address");


        // Display the received data

        tvName.setText("Name: " + name);

        tvEmail.setText("Email: " + email);

        tvPhone.setText("Phone: " + phone);

        tvGender.setText("Gender: " + gender);

        tvSemester.setText("Semester: " + semester);

        tvAddress.setText("Address: " + address);
    }
}