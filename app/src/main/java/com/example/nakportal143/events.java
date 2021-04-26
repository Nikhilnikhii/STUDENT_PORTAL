package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class events extends AppCompatActivity {


    PDFView eventspdf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        eventspdf1 = (PDFView)findViewById(R.id.eventspdf);
        eventspdf1.fromAsset("events.pdf").load();

    }
}
