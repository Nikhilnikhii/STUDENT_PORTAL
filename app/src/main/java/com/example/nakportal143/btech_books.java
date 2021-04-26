package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class btech_books extends AppCompatActivity {

    Button cse_book_btn123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech_books);
        cse_book_btn123 = (Button)findViewById(R.id.cse_btn);
        cse_book_btn123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cse123= new Intent(btech_books.this,cse_books.class);
                startActivity(cse123);

            }
        });
    }
}
