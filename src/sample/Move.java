package sample;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import java.util.Timer;
import java.util.TimerTask;
import static sample.Main.*;

public class Move {
    static boolean gameOver = false;
    static void start(Scene scene, Pane root) {
            final boolean[] lastRight = {false};
            Characters chars = new Characters(image, fog);
            Enemy en = new Enemy(enemy, 2);
            final int[] aCount = {0};
            final int[] dCount = {0};
            final int[] wCount = {0};
            final int[] sCount = {0};
            final boolean[] a = {false};
            final boolean[] d = {false};
            final boolean[] w = {false};
            final boolean[] s = {false};
            final int[] count = {0};
            final int[] countEnemy = {0};
            Timer timer = new Timer();
            scene.setOnKeyPressed(ke -> {

                KeyCode keyCode = ke.getCode();
                if ((keyCode.equals(KeyCode.W))) {
                    w[0] = true;
                } else if (keyCode.equals(KeyCode.S)) {
                    s[0] = true;
                } else if (keyCode.equals(KeyCode.A)) {
                    a[0] = true;
                    lastRight[0] = false;
                } else if (keyCode.equals(KeyCode.D)) {
                    d[0] = true;
                    lastRight[0] = true;
                }
            });

            scene.setOnKeyReleased(ke -> {
                KeyCode keyCode = ke.getCode();
                if ((keyCode.equals(KeyCode.W))) {
                    w[0] = false;
                } else if (keyCode.equals(KeyCode.S)) {
                    s[0] = false;
                } else if (keyCode.equals(KeyCode.A)) {
                    a[0] = false;
                } else if (keyCode.equals(KeyCode.D)) {
                    d[0] = false;
                }
            });

            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    int x = (int) image.getX();
                    int y = (int) image.getY();

                    if (w[0] && MayMove.boxHere(x, y - 4)) {
                        chars.move(0, -2);
                        wCount[0]++;
                    } else wCount[0] = 0;

                    if (s[0] && MayMove.boxHere(x, y + 4)) {
                        chars.move(0, 2);
                        sCount[0]++;
                    } else sCount[0] = 0;

                    if (a[0] && MayMove.boxHere(x - 4, y)) {
                        chars.move(-2, 0);
                        aCount[0]++;
                    } else aCount[0] = 0;

                    if (d[0] && MayMove.boxHere(x + 4, y)) {
                        chars.move(2, 0);
                        dCount[0]++;
                    } else dCount[0] = 0;
                    EnemyBang.create(countEnemy);
                    en.move();
                    countEnemy[0]++;
                    if (wCount[0] == 0 && aCount[0] == 0 && dCount[0] == 0 && sCount[0] == 0) count[0]++;
                    AnimationEnemy.start(countEnemy);
                    SpeedBoost.start(wCount, sCount, aCount, dCount, chars);
                    AnimationChar.start(wCount, sCount, dCount, aCount, count, lastRight);
                    GiveItem.check();
                    Health.change(enemy, 1);
                    Health.check(timer);
                    Win.check(timer);
                }

            };
            timer.schedule(timerTask, 0, 20);

    }
}
