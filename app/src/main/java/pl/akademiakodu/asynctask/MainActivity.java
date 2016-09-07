package pl.akademiakodu.asynctask;


import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {


    @BindView(R.id.image)
    public ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Animation animationFade = AnimationUtils.loadAnimation(this, R.anim.fade_in);
       // animationFade.setFillAfter(true);


         animationFade.setAnimationListener(new Animation.AnimationListener() {
             @Override
             public void onAnimationStart(Animation animation) {

             }

             @Override
             public void onAnimationEnd(Animation animation) {
                // Toast.makeText(MainActivity.this, "Zakonczono animacje!", Toast.LENGTH_LONG).show();
             }

             @Override
             public void onAnimationRepeat(Animation animation) {

             }
         });

        image.startAnimation(animationFade);


     //  image.setAnimation(animationFade);
      //  animationFade.start();

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
