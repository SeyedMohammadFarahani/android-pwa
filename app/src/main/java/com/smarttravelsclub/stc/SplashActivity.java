package com.smarttravelsclub.stc;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashActivity extends Activity {
    private static String TAG = SplashActivity.class.getName();
    private static long MAX_SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new CountDownTimer(2000, 500) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }

        }.start();

       /* new Thread() {
            @Override
            public void run() {
                synchronized (MainActivity.SPLASH_LOCK) {
                    // wait for notify or time-out
                    try { MainActivity.SPLASH_LOCK.wait(MAX_SPLASH_TIME); }
                    catch (InterruptedException ignored) {}
                }
                finish();
            }
        }.start();*/

    }
}