package sample.Model;

import static sample.Main.*;
import static sample.Model.Move.countEnemy;

class EnemyBang {
    private static double here[] = {0, 0, 0, 0};

    static void create() {
        int speedOfCreate = 150;
        if (countEnemy % speedOfCreate == 0) EnemyBang.start();
        else if (countEnemy % speedOfCreate == speedOfCreate - 1) EnemyBang.finish();
        else {
            EnemyBang.move();
            EnemyBang.heroPain();
        }
    }

    private static void whereIsPlayer(){
        if (image.getY()<enemy.getY()) here[0] = enemy.getY()-image.getY(); //w
        if (image.getY()>enemy.getY()) here[1] = image.getY()-enemy.getY();//s
        if (image.getX()<enemy.getX()) here[2] = enemy.getX()-image.getX();//a
        if (image.getX()>enemy.getX()) here[3] = image.getX()-enemy.getX();//d
    }

    private static void start() {
        bang.setX(enemy.getX()+10);
        bang.setY(enemy.getY()+10);
        bang.setVisible(true);
        here[0] = 0;
        here[1] = 0;
        here[2] = 0;
        here[3] = 0;
        EnemyBang.whereIsPlayer();
    }

    private static void finish() {
        bang.setVisible(false);

    }

    private static void heroPain() {
        int pain = 40;
        Health.change(bang, pain);
            if (CollisionObjects.check(bang, image)) {
                bang.setVisible(false);
                explosive.stop();
                explosive.play();
            }
        }

    private static void move(){
        int i = 0;
        int mover = 5;
        for (double a: here) {
            if (a != 0) i++;
        }
        if (i > 1) mover /= Math.sqrt(2);
        if (here[0]!=0 && ((here[2]/here[0]<=Math.sqrt(3) && here[2]!=0)||(here[3]/here[0]<=Math.sqrt(3) && here[3]!=0)
                || (here[2]==0 && here[3]==0))) {
            bang.setY(bang.getY() - mover);
        }
        if (here[1]!=0 && ((here[2]/here[1]<=Math.sqrt(3) && here[2]!=0)||(here[3]/here[1]<=Math.sqrt(3) && here[3]!=0)
                || (here[2]==0 && here[3]==0))) {
            bang.setY(bang.getY() + mover);
        }
        if (here[2]!=0 && ((here[0]/here[2]<=Math.sqrt(3) && here[0]!=0)||(here[1]/here[2]<=Math.sqrt(3) && here[1]!=0)
                || (here[1]==0 && here[0]==0))) {
            bang.setX(bang.getX() - mover);
        }
        if (here[3]!=0 && ((here[0]/here[3]<=Math.sqrt(3) && here[0]!=0)||(here[1]/here[3]<=Math.sqrt(3) && here[1]!=0)
                || (here[1]==0 && here[0]==0))) {
            bang.setX(bang.getX() + mover);
        }
    }
}
