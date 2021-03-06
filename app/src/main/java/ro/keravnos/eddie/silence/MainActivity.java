package ro.keravnos.eddie.silence;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ro.keravnos.eddie.silence.Fragment.MapFragment;
import ro.keravnos.eddie.silence.Model.BackgroundService;
import ro.keravnos.eddie.silence.Model.BottomNav;
import ro.keravnos.eddie.silence.Model.ViewPagerAdapter;
import ro.keravnos.eddie.silence.Model.Notifications;

public class MainActivity extends AppCompatActivity
{
    public static final String CHANNEL_ID = "0" ;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ViewPager viewPager = findViewById(R.id.viewpager);
        bottomNavigationView =  findViewById(R.id.bottom_navigation);
        ViewPagerAdapter v =new ViewPagerAdapter(getSupportFragmentManager(), this);


        BottomNav  bot = new BottomNav();
        bot.create(this,v,bottomNavigationView, viewPager);
    }


}


