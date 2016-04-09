package com.example.hilla_000.firststep;

import android.content.Context;
import android.media.MediaPlayer;

public class AppWideAudio {
    private static MediaPlayer mp;
    private static int currentMusic = -1;

    public static void start(Context context, int music) {
        start(context, music, false);
    }

    public static void start(Context context, int music, boolean force) {
        if (!force && currentMusic > -1) {
            return;
        }
        if (currentMusic == music) {
            return;
        }
        currentMusic = music;
        mp = MediaPlayer.create(context, music); //TODO: Bind audio file here
        mp.setVolume(100, 100);
        mp.setLooping(true);
        mp.start();
    }

    public static void pause() {
        mp.pause();
        currentMusic = -1;
    }

    public static void release() {
        try {
            if (mp != null) {
                if (mp.isPlaying()) {
                    mp.stop();
                }
                mp.release();
            }
        } catch (Exception e) {
        }
        currentMusic = -1;
    }
}
