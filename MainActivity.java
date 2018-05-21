package com.example.stelly.fima;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.animation.Animation;
        import android.view.View;
        import android.view.animation.AnimationUtils;
        import android.widget.Button;
        import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {


    Animation Fade_in, Fade_out;
    ViewFlipper viewFlipper;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Overridesuper.onCreate(savedInstanceState);
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewflipper1);


        Fade_in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Fade_out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);

        viewFlipper.setInAnimation(Fade_in);
        viewFlipper.setOutAnimation(Fade_out);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        final Button bContinue = (Button) findViewById(R.id.bContinue);
        bContinue.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(registerIntent);


                findViewById(R.id.bckgrndViewflipper1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //stop auto flipping
                        viewFlipper.stopFlipping();
                    }


                });
            }


        });
    }
}



