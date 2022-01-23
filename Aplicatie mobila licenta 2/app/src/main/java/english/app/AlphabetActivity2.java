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



public class AlphabetActivity2 extends AppCompatActivity {
    private SoundPool soundPool;
    private int j,k,l,m,n,o,p,q,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet2);
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
        j = soundPool.load(this, R.raw.j, 1);
        k = soundPool.load(this, R.raw.k, 1);
        l = soundPool.load(this, R.raw.l, 1);
        m = soundPool.load(this, R.raw.m, 1);
        n = soundPool.load(this, R.raw.n, 1);
        o = soundPool.load(this, R.raw.o, 1);
        p = soundPool.load(this, R.raw.p, 1);
        q = soundPool.load(this, R.raw.q, 1);
        r = soundPool.load(this, R.raw.r, 1);

    }
    @SuppressLint("NonConstantResourceId")
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button22:
                soundPool.play(j, 1, 1, 0, 0, 1);
                break;
            case R.id.button23:
                soundPool.play(k, 1, 1, 0, 0, 1);
                break;
            case R.id.button24:
                soundPool.play(l, 1, 1, 0, 0, 1);
                break;
            case R.id.button25:
                soundPool.play(m, 1, 1, 0, 0, 1);
                break;
            case R.id.button26:
                soundPool.play(n, 1, 1, 0, 0, 1);
                break;
            case R.id.button27:
                soundPool.play(o, 1, 1, 0, 0, 1);
                break;
            case R.id.button29:
                soundPool.play(p, 1, 1, 0, 0, 1);
                break;
            case R.id.button30:
                soundPool.play(q, 1, 1, 0, 0, 1);
                break;
            case R.id.button31:
                soundPool.play(r, 1, 1, 0, 0, 1);
                break;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }






    public void openAlphabetActivity3(View view) {
        Intent intent = new Intent(this, AlphabetActivity3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }



}