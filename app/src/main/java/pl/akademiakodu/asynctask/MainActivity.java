package pl.akademiakodu.asynctask;


import android.animation.AnimatorSet;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity  {


    @BindView(R.id.image)
    public ImageView image;

    @BindView(R.id.layout)
    public RelativeLayout layout;


    public final static int RUN_ANIMATION = 1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        final AnimationDrawable animation = (AnimationDrawable) layout.getBackground();
      //  animation.start();


        Handler handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                 if(msg.what == 1) {
                     animation.start();
                 }else if(msg.what == 2) {
                     animation.stop();
                 }

                return false;
            }
        });

        handler.sendEmptyMessageDelayed(1, 5000);
        handler.sendEmptyMessageDelayed(2, 10000);


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                animation.start();
//            }
//        }, 5000);

    }

}
