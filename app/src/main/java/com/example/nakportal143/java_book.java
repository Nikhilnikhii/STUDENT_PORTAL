package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class java_book extends AppCompatActivity {

    PDFView java_book123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_book);

        java_book123 = (PDFView)findViewById(R.id.java_book_pdf);
        java_book123.fromAsset("java.pdf").load();
    }
}
