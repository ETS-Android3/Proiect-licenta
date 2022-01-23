package english.app;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;



public class AlphabetActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int a,b,c,d,e,f,g,h,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
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
        a = soundPool.load(this, R.raw.a, 1);
        b = soundPool.load(this, R.raw.b, 1);
        c = soundPool.load(this, R.raw.c, 1);
        d = soundPool.load(this, R.raw.d, 1);
        e = soundPool.load(this, R.raw.e, 1);
        f = soundPool.load(this, R.raw.f, 1);
        g = soundPool.load(this, R.raw.g, 1);
        h = soundPool.load(this, R.raw.h, 1);
        i = soundPool.load(this, R.raw.i, 1);

    }
    @SuppressLint("NonConstantResourceId")
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button100:
                soundPool.play(a, 1, 1, 0, 0, 1);
                break;
            case R.id.button101:
                soundPool.play(b, 1, 1, 0, 0, 1);
                break;
            case R.id.button102:
                soundPool.play(c, 1, 1, 0, 0, 1);
                break;
            case R.id.button103:
                soundPool.play(d, 1, 1, 0, 0, 1);
                break;
            case R.id.button108:
                soundPool.play(e, 1, 1, 0, 0, 1);
                break;
            case R.id.button104:
                soundPool.play(f, 1, 1, 0, 0, 1);
                break;
            case R.id.button105:
                soundPool.play(g, 1, 1, 0, 0, 1);
                break;
            case R.id.button106:
                soundPool.play(h, 1, 1, 0, 0, 1);
                break;
            case R.id.button107:
                soundPool.play(i, 1, 1, 0, 0, 1);
                break;

        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }





    public void openAlphabetActivity2(View view) {
        Intent intent = new Intent(this, AlphabetActivity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }



}