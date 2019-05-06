package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;


public class AnimationEnemy {
    public static void start(ImageView enemy, int[] countEnemy) {
        if (countEnemy[0] % 6 == 0) enemy.setViewport(new Rectangle2D(countEnemy[0] / 6 % 10 * 500, 0, 500, 500));
    }
}
