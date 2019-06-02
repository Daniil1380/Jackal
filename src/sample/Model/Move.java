package sample.Model;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import sample.Control.KeyPress;
import sample.View.AnimationChar;
import sample.View.AnimationEnemy;
import static sample.Main.*;
import static sample.Model.AllOptions.damagePerFrame;
import static sample.Model.AllOptions.playerSpeed;

public class Move {
    static boolean gameOver = false;
    public static int aCount = 0;
    public static int dCount = 0;
    public static int wCount = 0;
    public static int sCount = 0;
    public static boolean a = false;
    public static boolean d = false;
    public static boolean w = false;
    public static boolean s = false;
    public static int count = 0;
    public static int countEnemy = 0;
    public static boolean lastRight = false;

    public static void start(Scene scene) {
        Characters chars = new Characters(image, fog);
        int radius = 1000;
        Enemy en = new Enemy(enemy, playerSpeed, radius);
        KeyPress.check(scene);
        AnimationTimer timers = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (Win.check()) Win.start();
                else if (hp > 0) {
                    int x = (int) image.getX();
                    int y = (int) image.getY();
                    MayMove.check(x, y, chars);
                    EnemyBang.create();
                    en.move();
                    countEnemy++;
                    if (wCount == 0 && aCount == 0 && dCount == 0 && sCount == 0) count++;
                    AnimationEnemy.start();
                    SpeedBoost.start(chars);
                    AnimationChar.start();
                    GiveItem.check();
                    Health.change(enemy, damagePerFrame);
                }
                else Loose.check();
            }
        };
        timers.start();

    }
}
