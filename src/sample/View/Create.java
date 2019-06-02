package sample.View;

import javafx.geometry.Rectangle2D;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.util.Random;
import static sample.Model.AllOptions.*;

import static sample.Main.*;

public class Create {
    private static int healthHeight = 20;
    private static int healthWidth = 200;
    private static int tabuZone = 6; // Зона, в которой не может быть собираемых обьектов (столбцы)
    private static int healthX = 0;
    private static int healthY = 637;
    private static int panel = 597;

    public static void fog(Pane root) {
        fog.setFitHeight(height * 2);
        fog.setFitWidth(2* width + 100);
        fog.setY(-50);
        fog.setX(-2 * height);
        root.getChildren().add(fog);
    }

    public static void film(Pane root) {
        int filmCenter = 882;
        film.setFitHeight(filmCenter);
        film.setFitWidth(width);
        root.getChildren().add(film);
        film.setVisible(false);
        film.setOpacity(0);
    }

    public static void text(Pane root) {
        text.setFitHeight(height);
        text.setFitWidth(width);
        text.setY(height);
        root.getChildren().add(text);
        text.setVisible(false);
        text.setEffect(new DropShadow());
    }

    public static void diedText(Pane root) {
        diedText.setFitHeight(height);
        diedText.setFitWidth(width);
        diedText.setY(height);
        root.getChildren().add(diedText);
        diedText.setVisible(false);
        diedText.setEffect(new DropShadow());
    }

    public static void healthFrame(Pane root) {
        ImageView healthFrame = new ImageView("sample/Files/healthFrame.png");
        healthFrame.setFitHeight(healthHeight + 4);
        healthFrame.setFitWidth(healthWidth + 4);
        healthFrame.setY(healthY);
        healthFrame.setX(healthX);
        root.getChildren().add(healthFrame);
    }

    public static void health(Pane root) {
        health.setFitHeight(healthHeight);
        health.setFitWidth(healthWidth);
        health.setY(healthY + 2);
        health.setX(healthX + 2);
        root.getChildren().add(health);
    }

    public static void enemy(Pane root) {
        enemy.setFitHeight(sizeBlock);
        enemy.setFitWidth(sizeBlock);
        enemy.setY(height - sizeBlock);
        enemy.setX(width - sizeBlock);
        root.getChildren().add(enemy);
    }

    public static void character(Pane root) {
        image.setFitHeight(charHeight);
        image.setFitWidth(charWidth);
        image.setY(height - 100);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void noir(Pane root) {
        ImageView noir = new ImageView("sample/Files/noir.png");
        noir.setFitHeight(2 * sizeBlock);
        noir.setFitWidth(4 * sizeBlock);
        root.getChildren().add(noir);
    }

    public static void floor(Pane root) {
        ImageView main = new ImageView("sample/Files/theme.png");
        main.setFitHeight(height);
        main.setFitWidth(width);
        root.getChildren().add(main);
    }

    public static void key(Pane root) {
        key.setFitWidth(sizeObjects);
        key.setFitHeight(sizeObjects);
        int column;
        int row;
        do {
            row = new Random().nextInt(blockInColumn);
            Random random = new Random();
            column = random.nextInt(blockInRow - tabuZone) + tabuZone;
        } while (boxes[row][column]=='1');
        key.setX(sizeBlock * (column) + (sizeBlock-sizeObjects)/2.0);
        key.setY(sizeBlock * (row) + (sizeBlock-sizeObjects)/2.0);
        key.setEffect(new DropShadow());
        root.getChildren().add(key);
    }

    public static void diary(Pane root) {
        diary.setFitWidth(sizeObjects);
        diary.setFitHeight(sizeObjects);
        int column;
        int row;
        do {
            row = new Random().nextInt(blockInColumn);
            Random random = new Random();
            column = random.nextInt(blockInRow - tabuZone) + tabuZone;
        } while (boxes[row][column]=='1');
        diary.setX(sizeBlock * (column) + (sizeBlock-sizeObjects)/2.0);
        diary.setY(sizeBlock * (row) + (sizeBlock-sizeObjects)/2.0);
        diary.setEffect(new DropShadow());
        root.getChildren().add(diary);
    }

    public static void blood(Pane root) {
        blood.setFitWidth(sizeObjects);
        blood.setFitHeight(sizeObjects);
        int column;
        int row;
        do {
            row = new Random().nextInt(blockInColumn);
            Random random = new Random();
            column = random.nextInt(blockInRow - tabuZone) + tabuZone;
        } while (boxes[row][column]=='1');
        blood.setX(sizeBlock * (column) + (sizeBlock-sizeObjects)/2.0);
        blood.setY(sizeBlock * (row) + (sizeBlock-sizeObjects)/2.0);
        blood.setEffect(new DropShadow());
        root.getChildren().add(blood);
    }

    public static void pistol(Pane root) {
        pistol.setFitWidth(sizeObjects);
        pistol.setFitHeight(sizeObjects);
        int column;
        int row;
        do {
            row = new Random().nextInt(blockInColumn);
            Random random = new Random();
            column = random.nextInt(blockInRow - tabuZone) + tabuZone;
        } while (boxes[row][column]=='1');
        pistol.setX(sizeBlock * (column) + (sizeBlock-sizeObjects)/2.0);
        pistol.setY(sizeBlock * (row)+ (sizeBlock-sizeObjects)/2.0);
        pistol.setEffect(new DropShadow());
        root.getChildren().add(pistol);
    }

    public static void keyGreenRed(Pane root) {
        keyGreenRed.setFitHeight(sizeObjects);
        keyGreenRed.setFitWidth(sizeObjects);
        keyGreenRed.setY(panel);
        keyGreenRed.setEffect(new DropShadow());
        keyGreenRed.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(keyGreenRed);
    }

    public static void bloodGreenRed(Pane root) {
        bloodGreenRed.setFitHeight(sizeObjects);
        bloodGreenRed.setFitWidth(sizeObjects);
        bloodGreenRed.setY(panel);
        bloodGreenRed.setX(sizeObjects);
        bloodGreenRed.setEffect(new DropShadow());
        bloodGreenRed.setViewport(new Rectangle2D(0, 0, sizeBlock * 10, sizeBlock * 10));
        root.getChildren().add(bloodGreenRed);
    }

    public static void pistolGreenRed(Pane root) {
        pistolGreenRed.setFitHeight(sizeObjects);
        pistolGreenRed.setFitWidth(sizeObjects);
        pistolGreenRed.setY(panel);
        pistolGreenRed.setX(sizeObjects * 2);
        pistolGreenRed.setEffect(new DropShadow());
        pistolGreenRed.setViewport(new Rectangle2D(0, 0, sizeBlock * 10, sizeBlock * 10));
        root.getChildren().add(pistolGreenRed);
    }

    public static void diaryGreenRed(Pane root) {
        diaryGreenRed.setFitHeight(sizeObjects);
        diaryGreenRed.setFitWidth(sizeObjects);
        diaryGreenRed.setY(panel);
        diaryGreenRed.setX(sizeObjects * 3);
        diaryGreenRed.setEffect(new DropShadow());
        diaryGreenRed.setViewport(new Rectangle2D(0, 0, sizeBlock * 10, sizeBlock * 10));
        root.getChildren().add(diaryGreenRed);
    }

}
