package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLesson10 extends AppCompatActivity {
    private Button bt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);
        bt11 = (Button)findViewById(R.id.button97);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.pillow);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


    }
    public void openActivityLesson11(View view){
        Intent intent = new Intent(this, ActivityLesson11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}