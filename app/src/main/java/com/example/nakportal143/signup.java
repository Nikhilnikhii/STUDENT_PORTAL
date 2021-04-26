package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class signup extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    ImageButton but123=(ImageButton)findViewById(R.id.imageButton3);
    ImageButton but234=(ImageButton)findViewById(R.id.imageButton5);
    but123.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent s1 = new Intent(signup.this,logon.class);
            startActivity(s1);
            finish();
        }
    });
    but234.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent l1 = new Intent(signup.this,logon.class);
            startActivity(l1);
            finish();
        }
    });


    }
}
