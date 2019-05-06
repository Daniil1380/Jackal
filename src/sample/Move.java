package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Move {
    static void start(Scene scene, ImageView image, ImageView enemy, ImageView fog,
                      ImageView pistol, ImageView blood, ImageView diary, ImageView key, int[] hp, ImageView health,
                      MediaPlayer media, MediaPlayer take, ImageView pistolGreenRed, ImageView bloodGreenRed,
                      ImageView diaryGreenRed, ImageView keyGreenRed) {
        ArrayList<Integer> boost = new ArrayList<Integer>();
        final boolean[] lastRight = {false};
        Characters chars = new Characters(image, fog);
        Enemy en = new Enemy(enemy);
        final int[] aCount = {0};
        final int[] dCount = {0};
        final int[] wCount = {0};
        final int[] sCount = {0};
        final boolean[] a = {false};
        final boolean[] d = {false};
        final boolean[] w = {false};
        final boolean[] s = {false};
        final int[] count = {0};
        final int[]countEnemy = {0};
        Timer timer = new Timer();
        scene.setOnKeyPressed(ke -> {

            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w[0] =true;
            } else if (keyCode.equals(KeyCode.S)) {
                s[0] =true;
            } else if (keyCode.equals(KeyCode.A)) {
                a[0] =true;
                lastRight[0] = false;
            } else if (keyCode.equals(KeyCode.D)) {
                d[0] =true;
                lastRight[0] = true;
            }
        });

        scene.setOnKeyReleased(ke -> {
            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w[0] =false;
            } else if (keyCode.equals(KeyCode.S)) {
                s[0] =false;
            } else if (keyCode.equals(KeyCode.A)) {
                a[0] =false;
            } else if (keyCode.equals(KeyCode.D)) {
                d[0] =false;
            }
        });

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                int x = (int) image.getX();
                int y = (int) image.getY();

                if (w[0] && MayMove.boxHere(x, y - 4))  {
                    chars.move(0, -2);
                    wCount[0]++;
                } else wCount[0]=0;

                if (s[0]&& MayMove.boxHere(x, y + 4)) {
                    chars.move(0, 2);
                    sCount[0]++;
                } else sCount[0]=0;

                if (a[0]&& MayMove.boxHere(x - 4, y)) {
                    chars.move(-2, 0);
                    aCount[0]++;
                } else aCount[0] = 0;

                if (d[0]&& MayMove.boxHere(x + 4, y)){
                    chars.move(2, 0);
                    dCount[0]++;
                } else dCount[0] = 0;

                en.move(image);

                countEnemy[0]++;
                if (wCount[0]==0 && aCount[0]==0 && dCount[0]==0 && sCount[0]==0) count[0]++;
                AnimationEnemy.start(enemy, countEnemy);
                SpeedBoost.start(wCount, sCount, aCount, dCount, chars, image);
                AnimationChar.start(image, wCount, sCount, dCount, aCount, count, lastRight);
                new GiveItem().check(image, pistol, blood, diary, key, take, bloodGreenRed, diaryGreenRed,
                        keyGreenRed, pistolGreenRed);
                Health.change(health, hp, enemy, image);
                Health.check(hp, timer, media);
                }

        };
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.schedule(timerTask, 0, 20);

    }
}
