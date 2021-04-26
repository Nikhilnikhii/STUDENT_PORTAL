package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class fees extends AppCompatActivity {
    PDFView feespdf123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);
        feespdf123 = (PDFView)findViewById(R.id.feespdf);
        feespdf123.fromAsset("fees.pdf").load();
    }
}
