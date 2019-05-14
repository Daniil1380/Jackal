package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.util.Random;

import static sample.Main.*;

public class Create {
    public static void fog(Pane root) {
        fog.setFitHeight(1300);
        fog.setFitWidth(2700);
        fog.setY(-50);
        fog.setX(-1300);
        root.getChildren().add(fog);
    }

    public static void film(Pane root) {
        film.setFitHeight(882);
        film.setFitWidth(1350);
        root.getChildren().add(film);
        film.setVisible(false);
        film.setOpacity(0);
    }

    public static void text(Pane root) {
        text.setFitHeight(650);
        text.setFitWidth(1300);
        text.setY(650);
        root.getChildren().add(text);
        text.setVisible(false);
        text.setEffect(new DropShadow());
    }

    public static void diedText(Pane root) {
        diedText.setFitHeight(650);
        diedText.setFitWidth(1300);
        diedText.setY(650);
        root.getChildren().add(diedText);
        diedText.setVisible(false);
        diedText.setEffect(new DropShadow());
    }

    public static void healthFrame(Pane root) {
        ImageView healthFrame = new ImageView("sample\\files\\HealthFrame.png");
        healthFrame.setFitHeight(24);
        healthFrame.setFitWidth(204);
        healthFrame.setY(637);
        healthFrame.setX(0);
        root.getChildren().add(healthFrame);
    }

    public static void health(Pane root) {
        health.setFitHeight(20);
        health.setFitWidth(200);
        health.setY(639);
        health.setX(2);
        root.getChildren().add(health);
    }

    public static void enemy(Pane root) {
        enemy.setFitHeight(50);
        enemy.setFitWidth(50);
        enemy.setY(600);
        enemy.setX(1250);
        root.getChildren().add(enemy);
    }

    public static void character(Pane root) {
        image.setFitHeight(80);
        image.setFitWidth(40);
        image.setY(550);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void noir(Pane root) {
        ImageView noir = new ImageView("sample\\files\\Noir.png");
        noir.setY(0);
        noir.setY(0);
        noir.setFitHeight(100);
        noir.setFitWidth(200);
        root.getChildren().add(noir);
    }

    public static void floor(Pane root) {
        ImageView main = new ImageView("sample\\files\\theme.png");
        main.setFitHeight(650);
        main.setFitWidth(1300);
        root.getChildren().add(main);
    }

    public static void key(Pane root) {
        key.setFitWidth(30);
        key.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(20) + 6;
        } while (boxes[row][column]=='1');
        key.setX(50 * (column)+10);
        key.setY(50 * (row)+10);
        key.setEffect(new DropShadow());
        root.getChildren().add(key);
    }

    public static void diary(Pane root) {
        diary.setFitWidth(30);
        diary.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(20) + 6;
        } while (boxes[row][column]=='1');
        diary.setX(50 * (column)+10);
        diary.setY(50 * (row)+10);
        diary.setEffect(new DropShadow());
        root.getChildren().add(diary);
    }

    public static void blood(Pane root) {
        blood.setFitWidth(30);
        blood.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(20) + 6;
        } while (boxes[row][column]=='1');
        blood.setX(50 * (column)+10);
        blood.setY(50 * (row)+10);
        blood.setEffect(new DropShadow());
        root.getChildren().add(blood);
    }

    public static void pistol(Pane root) {
        pistol.setFitWidth(30);
        pistol.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(20) + 6;
        } while (boxes[row][column]=='1');
        pistol.setX(50 * (column)+10);
        pistol.setY(50 * (row)+10);
        pistol.setEffect(new DropShadow());
        root.getChildren().add(pistol);
    }

    public static void keyGreenRed(Pane root) {
        keyGreenRed.setFitHeight(40);
        keyGreenRed.setFitWidth(40);
        keyGreenRed.setY(597);
        keyGreenRed.setEffect(new DropShadow());
        keyGreenRed.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(keyGreenRed);
    }

    public static void bloodGreenRed(Pane root) {
        bloodGreenRed.setFitHeight(40);
        bloodGreenRed.setFitWidth(40);
        bloodGreenRed.setY(597);
        bloodGreenRed.setX(40);
        bloodGreenRed.setEffect(new DropShadow());
        bloodGreenRed.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(bloodGreenRed);
    }

    public static void pistolGreenRed(Pane root) {
        pistolGreenRed.setFitHeight(40);
        pistolGreenRed.setFitWidth(40);
        pistolGreenRed.setY(597);
        pistolGreenRed.setX(80);
        pistolGreenRed.setEffect(new DropShadow());
        pistolGreenRed.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add( pistolGreenRed);
    }

    public static void diaryGreenRed(Pane root) {
        diaryGreenRed.setFitHeight(40);
        diaryGreenRed.setFitWidth(40);
        diaryGreenRed.setY(597);
        diaryGreenRed.setX(120);
        diaryGreenRed.setEffect(new DropShadow());
        diaryGreenRed.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(diaryGreenRed);
    }

}
