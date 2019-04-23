package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;

import java.util.Timer;
import java.util.TimerTask;

public class Move {
    static void start(Scene scene, ImageView image, ImageView enemy, ImageView fog) {
        final int[] aCount = {0};
        final int[] dCount = {0};
        final int[] wCount = {0};
        final int[] sCount = {0};
        final boolean[] a = {false};
        final boolean[] d = {false};
        final boolean[] w = {false};
        final boolean[] s = {false};
        Timer timer = new Timer();
        scene.setOnKeyPressed(ke -> {

            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w[0] =true;
            } else if (keyCode.equals(KeyCode.S)) {
                s[0] =true;
            } else if (keyCode.equals(KeyCode.A)) {
                a[0] =true;
            } else if (keyCode.equals(KeyCode.D)) {
                d[0] =true;
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
                if (w[0] && MayMove.boxHere((int)image.getX(), (int)image.getY() - 2))  {
                    image.setY(image.getY() - 2);
                    wCount[0]++;
                    fog.setY(fog.getY() - 2);
                } else wCount[0]=0;

                if (s[0]&& MayMove.boxHere((int)image.getX(), (int)image.getY() + 2)) {
                    image.setY(image.getY() + 2);
                    sCount[0]++;
                    fog.setY(fog.getY() + 2);
                } else sCount[0]=0;

                if (a[0]&& MayMove.boxHere((int)image.getX()- 2, (int)image.getY())) {
                    image.setX(image.getX() - 2);
                    aCount[0]++;
                    fog.setX(fog.getX() - 2);
                } else aCount[0] = 0;

                if (d[0]&& MayMove.boxHere((int)image.getX()+2, (int)image.getY())) {
                    image.setX(image.getX() + 2);
                    dCount[0]++;
                    fog.setX(fog.getX() + 2);
                } else dCount[0] = 0;


                if (image.getX() < enemy.getX()) enemy.setX(enemy.getX() - 1);
                if (image.getX() > enemy.getX()) enemy.setX(enemy.getX() + 1);
                if (image.getY() < enemy.getY()) enemy.setY(enemy.getY() - 1);
                if (image.getY() > enemy.getY()) enemy.setY(enemy.getY() + 1);

                if (wCount[0]>40 || (wCount[0]>16 && wCount[0] % 2 ==0) || ((wCount[0] % 4 == 0) && wCount[0]>0) &&
                        MayMove.boxHere((int)image.getX(), (int)image.getY() - 3)) {
                    image.setY(image.getY() - 1);
                    fog.setY(fog.getY() - 1);

                }
                if (sCount[0]>40 || (sCount[0]>16 && sCount[0] % 2 ==0) || ((sCount[0] % 4 == 0) && sCount[0]>0) &&
                        MayMove.boxHere((int)image.getX(), (int)image.getY() + 3)) {
                    image.setY(image.getY() + 1);
                    fog.setY(fog.getY() + 1);
                }
                if (dCount[0]>40 || (dCount[0]>16 && dCount[0] % 2 ==0) || ((dCount[0] % 4 == 0) && dCount[0]>0) &&
                        MayMove.boxHere((int)image.getX()+3, (int)image.getY())) {
                    image.setX(image.getX() + 1);
                    fog.setX(fog.getX() + 1);
                }
                if (aCount[0]>40 || (aCount[0]>16 && aCount[0] % 2 ==0) || ((aCount[0] % 4 == 0) && aCount[0]>0) &&
                        MayMove.boxHere((int)image.getX()-3, (int)image.getY())) {
                    image.setX(image.getX() - 1);
                    fog.setX(fog.getX() - 1);
                }
            }

        };

        timer.schedule(timerTask, 0, 20);

    }
}
