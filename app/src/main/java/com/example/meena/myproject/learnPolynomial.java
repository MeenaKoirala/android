package com.example.meena.myproject;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class learnPolynomial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_polynomial);

        VideoView polyView = (VideoView) findViewById(R.id.videoView_poly);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(polyView);
        Uri uri = Uri.parse("https://m.youtube.com/watch?v=egPRVWOjfVw");
        polyView.setMediaController(mediaController);
        polyView.setVideoURI(uri);
        polyView.requestFocus();
        polyView.start();
    }

}
//m.youtube.com/watch?v=VIDEO_egPRVWOjfVw&app=m