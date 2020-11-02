package com.example.tenkeybeats;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
            WindowInsetsController controller = getWindow().getInsetsController();
            if (controller != null) {
                controller.hide(WindowInsets.Type.statusBars()
                        | WindowInsets.Type.navigationBars());
                controller.setSystemBarsBehavior(
                        WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_IMMERSIVE
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }

        findViewById(R.id.button1).setOnTouchListener(this);
        findViewById(R.id.button2).setOnTouchListener(this);
        findViewById(R.id.button3).setOnTouchListener(this);
        findViewById(R.id.button4).setOnTouchListener(this);
        findViewById(R.id.button5).setOnTouchListener(this);
        findViewById(R.id.button6).setOnTouchListener(this);
        findViewById(R.id.button7).setOnTouchListener(this);
        findViewById(R.id.button8).setOnTouchListener(this);
        findViewById(R.id.button9).setOnTouchListener(this);
        findViewById(R.id.button0).setOnTouchListener(this);

        AudioAttributes attr = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        soundPool = new SoundPool.Builder()
                .setAudioAttributes(attr)
                .setMaxStreams(5)
                .build();
        sound1 = soundPool.load(this, R.raw.crash, 1);
        sound2 = soundPool.load(this, R.raw.cowbell, 1);
        sound3 = soundPool.load(this, R.raw.ride, 1);
        sound4 = soundPool.load(this, R.raw.open_hi_hat, 1);
        sound5 = soundPool.load(this, R.raw.hi_tom, 1);
        sound6 = soundPool.load(this, R.raw.low_tom, 1);
        sound7 = soundPool.load(this, R.raw.closed_hi_hat, 1);
        sound8 = soundPool.load(this, R.raw.snare, 1);
        sound9 = soundPool.load(this, R.raw.floor_tom, 1);
        sound0 = soundPool.load(this, R.raw.kick, 1);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (view.getId() == R.id.button1) {
                soundPool.play(sound1, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button2) {
                soundPool.play(sound2, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button3) {
                soundPool.play(sound3, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button4) {
                soundPool.play(sound4, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button5) {
                soundPool.play(sound5, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button6) {
                soundPool.play(sound6, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button7) {
                soundPool.play(sound7, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button8) {
                soundPool.play(sound8, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button9) {
                soundPool.play(sound9, 1f, 1f, 0, 0, 1);
            } else if (view.getId() == R.id.button0) {
                soundPool.play(sound0, 1f, 1f, 0, 0, 1);
            }
        }
        view.performClick();
        return false;
    }
}
