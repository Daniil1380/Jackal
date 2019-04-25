package sample;

import javafx.scene.image.ImageView;

public class Enemy {
    ImageView enemy;
    ImageView fog;

    Enemy(ImageView enemy) {
        this.enemy = enemy;
    }

    public void move(ImageView image) {
        if (Maths.radius(image.getX(), enemy.getX(), enemy.getY(), image.getY()) < 500) {
            if (image.getX() < enemy.getX()) enemy.setX(enemy.getX() - 1);
            if (image.getX() > enemy.getX()) enemy.setX(enemy.getX() + 1);
            if (image.getY() < enemy.getY()) enemy.setY(enemy.getY() - 1);
            if (image.getY() > enemy.getY()) enemy.setY(enemy.getY() + 1);
        }
    }
}

