package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cse_books extends AppCompatActivity {

    Button java_book123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_books);

        java_book123 = (Button)findViewById(R.id.java_book);
        java_book123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent java123 = new Intent(cse_books.this,java_book.class);
                startActivity(java123);

            }
        });
    }
}
