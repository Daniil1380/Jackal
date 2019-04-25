package sample;

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
    static void start(Scene scene, ImageView image, ImageView enemy, ImageView fog) {
        ArrayList<Integer> boost = new ArrayList<Integer>();
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
        Timer timer = new Timer();
        String file = "src\\sample\\files\\moveSound.mp3";
        Media sound = new Media(new File(file).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        scene.setOnKeyPressed(ke -> {

            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                mediaPlayer.play();
                w[0] =true;
            } else if (keyCode.equals(KeyCode.S)) {
                mediaPlayer.play();
                s[0] =true;
            } else if (keyCode.equals(KeyCode.A)) {
                mediaPlayer.play();
                a[0] =true;
            } else if (keyCode.equals(KeyCode.D)) {
                mediaPlayer.play();
                d[0] =true;
            }
        });

        scene.setOnKeyReleased(ke -> {
            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w[0] =false;
                mediaPlayer.stop();
            } else if (keyCode.equals(KeyCode.S)) {
                s[0] =false;
                mediaPlayer.stop();
            } else if (keyCode.equals(KeyCode.A)) {
                a[0] =false;
                mediaPlayer.stop();
            } else if (keyCode.equals(KeyCode.D)) {
                d[0] =false;
                mediaPlayer.stop();
            }
        });

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                int x = (int) image.getX();
                int y = (int) image.getY();
                if (w[0] && MayMove.boxHere(x, y - 2))  {
                    chars.move(0, -2);
                    wCount[0]++;
                } else wCount[0]=0;

                if (s[0]&& MayMove.boxHere(x, y + 2)) {
                    chars.move(0, 2);
                    sCount[0]++;
                } else sCount[0]=0;

                if (a[0]&& MayMove.boxHere(x - 2, y)) {
                    chars.move(-2, 0);
                    aCount[0]++;
                } else aCount[0] = 0;

                if (d[0]&& MayMove.boxHere(x + 2, y)){
                    chars.move(2, 0);
                    dCount[0]++;
                } else dCount[0] = 0;


                en.move(image);
                x = (int) image.getX();
                y = (int) image.getY();

                if (wCount[0]>55 || (wCount[0]>16 && wCount[0] % 2 ==0) || ((wCount[0] % 4 == 0) && wCount[0]>0) &&
                        MayMove.boxHere(x, y -2)) {
                    chars.move(0, -2);
                }
                if (sCount[0]>40 || (sCount[0]>16 && sCount[0] % 2 ==0) || ((sCount[0] % 4 == 0) && sCount[0]>0) &&
                        MayMove.boxHere(x, y + 2)) {
                    chars.move(0, 2);
                }
                if (dCount[0]>40 || (dCount[0]>16 && dCount[0] % 2 ==0) || ((dCount[0] % 4 == 0) && dCount[0]>0) &&
                        MayMove.boxHere(x+2, y)) {
                    chars.move(2, 0);
                }
                if (aCount[0]>40 || (aCount[0]>16 && aCount[0] % 2 ==0) || ((aCount[0] % 4 == 0) && aCount[0]>0) &&
                        MayMove.boxHere(x-2, y)) {
                    chars.move(-2, 0);
                }

            }

        };

        timer.schedule(timerTask, 0, 20);

    }
}
