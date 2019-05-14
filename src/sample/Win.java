package sample;


import java.util.Timer;
import java.util.TimerTask;

import static sample.Main.*;

public class Win {
    static void check(Timer timer) {
        if (!(diary.isVisible() || pistol.isVisible() || blood.isVisible() || key.isVisible())) {
            Move.gameOver = true;
            ost.stop();
            win.play();
            film.setVisible(true);
            timer.cancel();
            Timer end = new Timer();
            text.setVisible(true);
            film.setVisible(true);
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    text.setY(text.getY() - 2);
                    if (film.getOpacity() < 1) {
                        film.setOpacity(film.getOpacity() + 0.1);
                    }
                }
            };
            end.schedule(task, 0, 50);
            if (text.getY() < -650) {
                end.cancel();
            }

        }
    }
}
