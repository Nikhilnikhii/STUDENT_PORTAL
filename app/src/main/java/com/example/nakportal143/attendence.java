package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class attendence extends AppCompatActivity {

    PDFView atendencepdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);
        atendencepdf1 = (PDFView)findViewById(R.id.attendencepdf);


        atendencepdf1.fromAsset("attendence.pdf").load();
    }
}
