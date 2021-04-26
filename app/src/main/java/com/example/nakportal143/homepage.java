package com.example.nakportal143;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class homepage extends AppCompatActivity {

    ImageButton enroll_btn;
    ImageButton schedule_btn;
    ImageButton attendence_btn,events_btn,results_btn,fees_btn,chat_btn,books_btn,videos_btn,library_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        enroll_btn = (ImageButton)findViewById(R.id.enrollment);
        schedule_btn = (ImageButton)findViewById(R.id.schedule);
        attendence_btn =(ImageButton)findViewById(R.id.attendence);
        events_btn = (ImageButton)findViewById(R.id.events);
        results_btn = (ImageButton)findViewById(R.id.result);
        fees_btn = (ImageButton)findViewById(R.id.fees);
        chat_btn = (ImageButton)findViewById(R.id.chat);
        books_btn =(ImageButton)findViewById(R.id.books);
        videos_btn =(ImageButton)findViewById(R.id.videos);
        library_btn = (ImageButton)findViewById(R.id.library);




        enroll_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enroll = new Intent(homepage.this,enrollment.class);
                startActivity(enroll);

            }
        });

        schedule_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent schedule = new Intent(homepage.this,schedule.class);
                startActivity(schedule);
            }
        });
        attendence_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attendence = new Intent(homepage.this,attendence.class);
                startActivity(attendence);
            }
        });
        events_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent events = new Intent(homepage.this,events.class);
                startActivity(events);
            }
        });
        results_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent results = new Intent(homepage.this,results.class);
                startActivity(results);
            }
        });
        fees_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fees = new Intent(homepage.this,fees.class);
                startActivity(fees);

            }
        });
        chat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat = new Intent(homepage.this,results.class);
                startActivity(chat);

            }
        });
        books_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent books = new Intent(homepage.this, com.example.nakportal143.books.class);
                startActivity(books);

            }
        });
        videos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videos = new Intent(homepage.this,java_tutorial.class);
                startActivity(videos);

            }
        });
        library_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent library = new Intent(homepage.this,books.class);
                startActivity(library);
            }
        });

    }
}
