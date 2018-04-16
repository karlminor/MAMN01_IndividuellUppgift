package mamn01.karl.individuelluppgift;


import android.media.MediaPlayer;

import java.io.IOException;

public class ShakePlay implements Runnable {
    private Accelerometer am;
    private MediaPlayer mPlayer;
    private boolean flag;

    public ShakePlay(Accelerometer am){
        this.am = am;
        mPlayer = MediaPlayer.create(am, R.raw.shakeit);
    }

    @Override
    public void run() {
        while (true) {
            if (am.shake) {
                if(!mPlayer.isPlaying()) {
                    //if (flag) {
                        mPlayer.start();
                    //}
                }
            } else {
                if(mPlayer.isPlaying()) {
                    mPlayer.stop();
                    try {
                        mPlayer.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
