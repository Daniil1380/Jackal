package sample;


import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Health {
    public static void change(ImageView health, int hp[], ImageView enemy, ImageView image) {
        if (CollisonObjects.check(enemy, image) && hp[0]>0) {
            hp[0]-=1;
            health.setFitWidth(hp[0]+1);
            health.setViewport(new Rectangle2D(0, 0, hp[0]*5, 100));
        }
    }
    public static void check(int hp[], Timer timer, MediaPlayer media) {
        if (hp[0]==0) {
            media.play();
            timer.cancel();
        }
    }
}
