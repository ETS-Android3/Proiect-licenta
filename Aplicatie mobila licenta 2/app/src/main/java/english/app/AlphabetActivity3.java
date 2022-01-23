package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class AlphabetActivity3 extends AppCompatActivity {
    private SoundPool soundPool;
    private int s,t,u,vsound,w,x,y,z,congrats3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet3);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        }
        s = soundPool.load(this, R.raw.s, 1);
        t = soundPool.load(this, R.raw.t, 1);
        u = soundPool.load(this, R.raw.u, 1);
        vsound = soundPool.load(this, R.raw.vsound, 1);
        w = soundPool.load(this, R.raw.w, 1);
        x = soundPool.load(this, R.raw.x, 1);
        y = soundPool.load(this, R.raw.y, 1);
        z = soundPool.load(this, R.raw.z, 1);
        congrats3 = soundPool.load(this, R.raw.congratsalphabet, 1);


    }
    @SuppressLint("NonConstantResourceId")
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button32:
                soundPool.play(s, 1, 1, 0, 0, 1);
                break;
            case R.id.button42:
                soundPool.play(t, 1, 1, 0, 0, 1);
                break;
            case R.id.button38:
                soundPool.play(u, 1, 1, 0, 0, 1);
                break;
            case R.id.button37:
                soundPool.play(vsound, 1, 1, 0, 0, 1);
                break;
            case R.id.button36:
                soundPool.play(w, 1, 1, 0, 0, 1);
                break;
            case R.id.button35:
                soundPool.play(x, 1, 1, 0, 0, 1);
                break;
            case R.id.button34:
                soundPool.play(y, 1, 1, 0, 0, 1);
                break;
            case R.id.button33:
                soundPool.play(z, 1, 1, 0, 0, 1);
                break;
            case R.id.button14:
                soundPool.play(congrats3, 1, 1, 0, 0, 1);
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