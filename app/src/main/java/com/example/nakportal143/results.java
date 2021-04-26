package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class results extends AppCompatActivity {
    PDFView resultspdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultspdf1 = (PDFView)findViewById(R.id.resultspdf);
        resultspdf1.fromAsset("results2a.pdf").load();
    }
}
