package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class FruitsAndVegActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int tomato,banana,peach,pumpkin,carrot,radish,orange,pear,mushroom,congrats4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_and_veg);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(10)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        }
        tomato = soundPool.load(this, R.raw.tomato, 1);
        banana = soundPool.load(this, R.raw.banana, 1);
        peach = soundPool.load(this, R.raw.peach, 1);
        pumpkin = soundPool.load(this, R.raw.pumpkin, 1);
        carrot = soundPool.load(this, R.raw.carrot, 1);
        radish= soundPool.load(this, R.raw.radish, 1);
        orange = soundPool.load(this, R.raw.orange, 1);
        pear = soundPool.load(this, R.raw.pear, 1);
        mushroom = soundPool.load(this, R.raw.mushroom, 1);
        congrats4 = soundPool.load(this, R.raw.congratsfruits, 1);


    }
    @SuppressLint("NonConstantResourceId")
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button54:
                soundPool.play(tomato, 1, 1, 0, 0, 1);
                break;
            case R.id.button68:
                soundPool.play(banana, 1, 1, 0, 0, 1);
                break;
            case R.id.button69:
                soundPool.play(peach, 1, 1, 0, 0, 1);
                break;
            case R.id.button70:
                soundPool.play(pumpkin, 1, 1, 0, 0, 1);
                break;
            case R.id.button71:
                soundPool.play(carrot, 1, 1, 0, 0, 1);
                break;
            case R.id.button72:
                soundPool.play(radish, 1, 1, 0, 0, 1);
                break;
            case R.id.button73:
                soundPool.play(orange, 1, 1, 0, 0, 1);
                break;
            case R.id.button74:
                soundPool.play(pear, 1, 1, 0, 0, 1);
                break;
            case R.id.button75:
                soundPool.play(mushroom, 1, 1, 0, 0, 1);
                break;
            case R.id.button16:
                soundPool.play(congrats4, 1, 1, 0, 0, 1);
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