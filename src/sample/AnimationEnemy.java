package sample;

import javafx.geometry.Rectangle2D;
import static sample.Main.*;


public class AnimationEnemy {
    public static void start(int[] countEnemy) {
        if (countEnemy[0] % 6 == 0) enemy.setViewport(new Rectangle2D(countEnemy[0] / 6 % 10 * 500, 0, 500, 500));
    }
}
