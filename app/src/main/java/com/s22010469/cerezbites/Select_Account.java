package com.s22010469.cerezbites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Select_Account extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnSelectHome = findViewById(R.id.btnSelectHome);
        Button btnSelectOrganization = findViewById(R.id.btnSelectOrganization);
        Button btnSelectStudent = findViewById(R.id.btnSelectStudents);
        Button btnSelectBusiness = findViewById(R.id.btnSelectBusiness);


        btnSelectHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Account.this, Sign_up_home.class);
                startActivity(intent);
            }
        });

        btnSelectOrganization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Account.this, Sign_up_organization.class);
                startActivity(intent);
            }
        });

        btnSelectStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Account.this, Sign_up_students.class);
                startActivity(intent);
            }
        });

        btnSelectBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_Account.this, Sign_up_business.class);
                startActivity(intent);
            }
        });
    }
}