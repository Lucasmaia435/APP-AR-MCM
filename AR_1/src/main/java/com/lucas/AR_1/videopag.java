package com.example.mcm;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class videopag extends AppCompatActivity {
    VideoView vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videopag);
            vid = (VideoView) findViewById(R.id.videoView);
            String videopath = "android.resource://com.example.mcm/"+R.raw.video;
            Uri uri = Uri.parse(videopath);
            vid.setVideoURI(uri);
            vid.start();
    }
}
