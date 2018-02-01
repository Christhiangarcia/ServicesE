package com.example.chris.servicee;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Service implements MediaPlayer.OnPreparedListener {

    MediaPlayer reproductorM;
    String msg = "¡PRECAUCIÓN! Si se mantiene abierto, puede consumir mucha batería";
    int FORE_ID = 1335;

    @Override
    public void onCreate() {
        Toast.makeText(this,"Servicio creado",
                Toast.LENGTH_SHORT).show();
        reproductorM = MediaPlayer.create(this, R.raw.audio);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {

    }
}
