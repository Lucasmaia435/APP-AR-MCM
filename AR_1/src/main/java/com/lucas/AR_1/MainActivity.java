package com.lucas.AR_1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openVideo(View view){
        Toast myToast = Toast.makeText(this,"Abrindo vídeo...", Toast.LENGTH_SHORT);
        myToast.show();
        openVideolayout();
    }
    public void openAr(View view){
        Toast myToast = Toast.makeText(this,"Abrindo AR...", Toast.LENGTH_SHORT);
        myToast.show();
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        intent.putExtra("arguments", "data from android");
        startActivity(intent);
    }

    public void openVideolayout() {
        Intent intent = new Intent(this, videopag.class);
        startActivity(intent);
    }

    public void openAudio(View view){
        Toast myToast = Toast.makeText(this,"Abrindo áudio...", Toast.LENGTH_SHORT);
        myToast.show();
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.video);
        mp.start();
    }
}
