package sample.View;

import javafx.geometry.Rectangle2D;
import static sample.Main.*;
import static sample.Model.AllOptions.sizeBlock;
import static sample.Model.Move.countEnemy;


public class AnimationEnemy {
    public static void start() {
        int countEnemyAnimation = 10;
        int speedEnemyAnimation = 6;
        if (countEnemy % speedEnemyAnimation == 0) enemy.setViewport(new Rectangle2D(countEnemy / speedEnemyAnimation %
                countEnemyAnimation * sizeBlock * 10, 0, sizeBlock * 10, sizeBlock * 10));
    }
}
