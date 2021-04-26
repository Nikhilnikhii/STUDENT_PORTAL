package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class books extends AppCompatActivity {

    Button btechbt1,mtechbt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        btechbt1 = (Button)findViewById(R.id.btech_btn);
        mtechbt1 = (Button)findViewById(R.id.mtech_btn);

        btechbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btechbt= new Intent(books.this,btech_books.class);
                startActivity(btechbt);

            }
        });

        mtechbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mtechbt = new Intent(books.this,mtech_books.class);
                startActivity(mtechbt);

            }
        });
    }
}
