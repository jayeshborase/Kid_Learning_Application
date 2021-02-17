package com.swami.kidlearninghere;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music_system extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button play,stop,pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_system);
        mediaPlayer = MediaPlayer.create(this, R.raw.music);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

    }

}