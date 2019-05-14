package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import static sample.Main.*;

public class Enemy {
    ImageView enemy;
    int i;


    Enemy(ImageView enemy,int i) {
        this.enemy = enemy;
        this.i = i;
    }

    public void move() {
        if (Maths.radius(image.getX(), enemy.getX(), enemy.getY(), image.getY()) < 1000) {
            if (image.getX() < enemy.getX()) enemy.setX(enemy.getX() - i);
            if (image.getX() > enemy.getX()) enemy.setX(enemy.getX() + i);
            if (image.getY() < enemy.getY()) enemy.setY(enemy.getY() - i);
            if (image.getY() > enemy.getY()) enemy.setY(enemy.getY() + i);
        }
    }
    public void bang(Pane root) {
        bang.setX(enemy.getX());
        bang.setY(enemy.getY());
        bang.setVisible(true);

    }
}

