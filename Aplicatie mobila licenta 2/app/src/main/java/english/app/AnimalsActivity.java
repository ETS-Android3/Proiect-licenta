package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class AnimalsActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int zebra, tiger, lion, dog, elephant, cat, cow, giraffe, horse,congrats2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
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
            zebra = soundPool.load(this, R.raw.zebra, 1);
            tiger = soundPool.load(this, R.raw.tiger, 1);
            lion = soundPool.load(this, R.raw.lion, 1);
            dog = soundPool.load(this, R.raw.dog, 1);
            elephant = soundPool.load(this, R.raw.elephant, 1);
            cat = soundPool.load(this, R.raw.cat, 1);
            cow = soundPool.load(this, R.raw.cow, 1);
            giraffe = soundPool.load(this, R.raw.giraffe, 1);
            horse = soundPool.load(this, R.raw.horse, 1);
           congrats2 = soundPool.load(this, R.raw.congratsanimals, 1);



        }
        @SuppressLint("NonConstantResourceId")
        public void playSound (View v){
            switch (v.getId()) {
                case R.id.button55:
                    soundPool.play(zebra, 1, 1, 0, 0, 1);
                    break;
                case R.id.button56:
                    soundPool.play(tiger, 1, 1, 0, 0, 1);
                    break;
                case R.id.button57:
                    soundPool.play(lion, 1, 1, 0, 0, 1);
                    break;
                case R.id.button58:
                    soundPool.play(dog, 1, 1, 0, 0, 1);
                    break;
                case R.id.button59:
                    soundPool.play(elephant, 1, 1, 0, 0, 1);
                    break;
                case R.id.button60:
                    soundPool.play(cat, 1, 1, 0, 0, 1);
                    break;
                case R.id.button61:
                    soundPool.play(cow, 1, 1, 0, 0, 1);
                    break;
                case R.id.button62:
                    soundPool.play(giraffe, 1, 1, 0, 0, 1);
                    break;
                case R.id.button63:
                    soundPool.play(horse, 1, 1, 0, 0, 1);
                    break;
                case R.id.button15:
                    soundPool.play(congrats2, 1, 1, 0, 0, 1);
                    break;
            }
        }
        @Override
        protected void onDestroy () {
            super.onDestroy();
            soundPool.release();
            soundPool = null;


        }
    }
