package sample;


import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;


import java.util.Timer;
import java.util.TimerTask;

import static sample.Main.*;

public class Health {
    public static void change(ImageView enemyF, int i) {
        if (CollisonObjects.check(enemyF, image) && hp[0]>0 && enemyF.isVisible()) {
            if (hp[0]<i) hp[0]=0;
            else hp[0]-=i;
            health.setFitWidth(hp[0]+1);
            health.setViewport(new Rectangle2D(0, 0, hp[0]*5, 100));
        }
    }
    public static void check(Timer timer) {
        if (hp[0]==0) {
            Move.gameOver = true;
            media.play();
            ost.stop();
            timer.cancel();
            film.setVisible(true);
            diedText.setVisible(true);
            Timer death = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    diedText.setY( diedText.getY() - 2);
                    if (film.getOpacity() < 1) {
                        film.setOpacity(film.getOpacity() + 0.1);
                    }
                }
            };
            death.schedule(task, 0, 50);
            if ( diedText.getY() < -650) {
                death.cancel();
            }
        }
    }
}
