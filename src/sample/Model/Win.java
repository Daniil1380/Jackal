package sample.Model;


import java.util.Timer;

import static sample.Main.*;
import static sample.Model.AllOptions.*;

class Win {
    static boolean check() {
        return !(diary.isVisible() || pistol.isVisible() || blood.isVisible() || key.isVisible());
        }

    static  void start() {
        if (text.getY() == 650) {
            Move.gameOver = true;
            ost.stop();
            win.play();
            film.setVisible(true);
            Timer end = new Timer();
            text.setVisible(true);
            film.setVisible(true);
        }
        if (text.getY() > -1 * height) {
            text.setY(text.getY() - 1);
            if (film.getOpacity() < 1) {
                film.setOpacity(film.getOpacity() + 0.04);
            }
        }
    }
}
