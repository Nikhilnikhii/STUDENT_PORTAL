package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class schedule extends AppCompatActivity {

    PDFView schedulepdf1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        schedulepdf1 = (PDFView)findViewById(R.id.schedulepdf);


        schedulepdf1.fromAsset("schedule.pdf").load();
    }
}
