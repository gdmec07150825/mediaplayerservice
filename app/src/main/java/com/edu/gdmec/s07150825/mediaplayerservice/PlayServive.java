package com.edu.gdmec.s07150825.mediaplayerservice;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.UnsupportedSchemeException;
import android.os.IBinder;


/**
 * Created by hasee on 2016/12/19.
 */
public class PlayServive extends Service {
    MediaPlayer mediaPlayer;

    public PlayServive() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this, R.raw.exodus);
        mediaPlayer.setLooping(true);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();

    }
}
