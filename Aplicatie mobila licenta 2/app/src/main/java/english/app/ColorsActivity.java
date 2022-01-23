package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class ColorsActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int red,orange,yellow,green,blue,pink,congrats1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);
        }
        red = soundPool.load(this, R.raw.red, 1);
        orange = soundPool.load(this, R.raw.orange, 1);
        yellow = soundPool.load(this, R.raw.yellow, 1);
        green = soundPool.load(this, R.raw.green, 1);
        blue = soundPool.load(this, R.raw.blue, 1);
        pink = soundPool.load(this, R.raw.pink, 1);
        congrats1 = soundPool.load(this, R.raw.congratscolors, 1);

    }
    @SuppressLint("NonConstantResourceId")
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button64:
                soundPool.play(red, 1, 1, 0, 0, 1);
                break;
            case R.id.button65:
                soundPool.play(orange, 1, 1, 0, 0, 1);
                break;
            case R.id.button66:
                soundPool.play(yellow, 1, 1, 0, 0, 1);
                break;
            case R.id.button67:
                soundPool.play(green, 1, 1, 0, 0, 1);
                break;
            case R.id.button76:
                soundPool.play(blue, 1, 1, 0, 0, 1);
                break;
            case R.id.button77:
                soundPool.play(pink, 1, 1, 0, 0, 1);
                break;
            case R.id.button12:
                soundPool.play(congrats1, 1, 1, 0, 0, 1);
                break;

        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}
