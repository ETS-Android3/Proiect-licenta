package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int one,two,three,four,five,six,seven,eight,nine,ten,congrats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(11)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(11, AudioManager.STREAM_MUSIC, 0);
        }
        one = soundPool.load(this, R.raw.one, 1);
        two = soundPool.load(this, R.raw.two, 1);
        three = soundPool.load(this, R.raw.three, 1);
        four = soundPool.load(this, R.raw.four, 1);
        five = soundPool.load(this, R.raw.five, 1);
        six = soundPool.load(this, R.raw.six, 1);
        seven = soundPool.load(this, R.raw.seven, 1);
        eight = soundPool.load(this, R.raw.eight, 1);
        nine = soundPool.load(this, R.raw.nine, 1);
        ten = soundPool.load(this, R.raw.ten, 1);
        congrats = soundPool.load(this, R.raw.congratsnumbers, 1);

    }
        @SuppressLint("NonConstantResourceId")
        public void playSound(View v) {
            switch (v.getId()) {
                case R.id.button43:
                    soundPool.play(one, 1, 1, 0, 0, 1);
                    break;
                case R.id.button44:
                    soundPool.play(two, 1, 1, 0, 0, 1);
                    break;
                case R.id.button45:
                    soundPool.play(three, 1, 1, 0, 0, 1);
                    break;
                case R.id.button46:
                    soundPool.play(four, 1, 1, 0, 0, 1);
                    break;
                case R.id.button47:
                    soundPool.play(five, 1, 1, 0, 0, 1);
                    break;
                case R.id.button48:
                    soundPool.play(six, 1, 1, 0, 0, 1);
                    break;
                case R.id.button49:
                    soundPool.play(seven, 1, 1, 0, 0, 1);
                    break;
                case R.id.button50:
                    soundPool.play(eight, 1, 1, 0, 0, 1);
                    break;
                case R.id.button51:
                    soundPool.play(nine, 1, 1, 0, 0, 1);
                    break;
                case R.id.button52:
                    soundPool.play(ten, 1, 1, 0, 0, 1);
                    break;
                case R.id.button13:
                    soundPool.play(congrats, 1, 1, 0, 0, 1);
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