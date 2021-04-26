package com.example.nakportal143;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class java_tutorial extends AppCompatActivity {

    //Button clk;
    //VideoView videov;
    //MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorial);

        //clk = (Button)findViewById(R.id.playbutton);
        //videov = (VideoView)findViewById(R.id.videoView);
        //mediac = new MediaController(this);

    }

    /*
    public  void  videoplay(View v)
    {
        String videopath = "android.resource://com.example.nakportal143/"+R.raw.javavideo;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);


        videov.start();
    }*/

}
