package sample.Model;

import javafx.scene.image.ImageView;
import static sample.Main.image;
import static sample.Model.Maths.radius;

public class Enemy {
    private ImageView enemy;
    private int i;
    private int raduis;


    Enemy(ImageView enemy,int i, int radius) {
        this.enemy = enemy;
        this.i = i;
        this.raduis = radius;
    }

    public void move() {
        if (radius(image.getX(), enemy.getX(), enemy.getY(), image.getY()) < raduis) {
            if (image.getX() < enemy.getX()) enemy.setX(enemy.getX() - i);
            if (image.getX() > enemy.getX()) enemy.setX(enemy.getX() + i);
            if (image.getY() < enemy.getY()) enemy.setY(enemy.getY() - i);
            if (image.getY() > enemy.getY()) enemy.setY(enemy.getY() + i);
        }
    }
}

