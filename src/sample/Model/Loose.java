package sample.Model;

import static sample.Main.*;
import static sample.Main.diedText;
import static sample.Main.film;
import static sample.Model.AllOptions.height;

public class Loose {
    static void check() {
        if (diedText.getY() == height) {
            Move.gameOver = true;
            media.play();
            ost.stop();
            film.setVisible(true);
            diedText.setVisible(true);
        }
        if (diedText.getY() > -1 * height) {
            diedText.setY(diedText.getY() - 1);
            if (film.getOpacity() < 1) {
                film.setOpacity(film.getOpacity() + 0.04);
            }
        }
    }
}
