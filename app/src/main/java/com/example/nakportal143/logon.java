package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class logon extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);

        ImageButton signup=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton logon=(ImageButton)findViewById(R.id.imageButton);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l2 = new Intent(logon.this,signup.class);
                startActivity(l2);
                finish();
            }
        });
        logon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f2 = new Intent(logon.this,homepage.class);
                startActivity(f2);
                finish();
            }
        });

    }
}
