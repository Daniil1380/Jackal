package sample;

import javafx.geometry.Rectangle2D;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.Random;

public class Create {
    public static void fog(ImageView fog, Pane root) {
        fog.setFitHeight(1300);
        fog.setFitWidth(2700);
        fog.setY(-50);
        fog.setX(-1300);
        root.getChildren().add(fog);
    }

    public static void healthFrame(Pane root) {
        ImageView healthFrame = new ImageView("sample\\files\\HealthFrame.png");
        healthFrame.setFitHeight(24);
        healthFrame.setFitWidth(204);
        healthFrame.setY(637);
        healthFrame.setX(0);
        root.getChildren().add(healthFrame);
    }

    public static void health(ImageView health, Pane root) {
        health.setFitHeight(20);
        health.setFitWidth(200);
        health.setY(639);
        health.setX(2);
        root.getChildren().add(health);
    }

    public static void enemy(ImageView enemy, Pane root) {
        enemy.setFitHeight(50);
        enemy.setFitWidth(50);
        enemy.setY(600);
        enemy.setX(1250);
        root.getChildren().add(enemy);
    }

    public static void character(ImageView image, Pane root) {
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
        main.setY(0);
        main.setY(0);
        main.setFitHeight(650);
        main.setFitWidth(1300);
        root.getChildren().add(main);
    }

    public static void ost() {
        String file = "src\\sample\\files\\mainTheme.mp3";
        Media sound = new Media(new File(file).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    public static void key(ImageView image, Pane root) {
        image.setFitWidth(30);
        image.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(26);
        } while (AllOptions.mover.charAt(row * 26 + column)=='1');
        image.setX(50 * (column)+10);
        image.setY(50 * (row)+10);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void diary(ImageView image, Pane root) {
        image.setFitWidth(30);
        image.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(26);
        } while (AllOptions.mover.charAt(row * 26 + column)=='1');
        image.setX(50 * (column)+10);
        image.setY(50 * (row)+10);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void blood(ImageView image, Pane root) {
        image.setFitWidth(30);
        image.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(26);
        } while (AllOptions.mover.charAt(row * 26 + column)=='1');
        image.setX(50 * (column)+10);
        image.setY(50 * (row)+10);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void pistol(ImageView image, Pane root) {
        image.setFitWidth(30);
        image.setFitHeight(30);
        int column = 0;
        int row = 0;
        do {
            row = new Random().nextInt(13);
            Random random = new Random();
            column = random.nextInt(26);
        } while (AllOptions.mover.charAt(row * 26 + column)=='1');
        image.setX(50 * (column)+10);
        image.setY(50 * (row)+10);
        image.setEffect(new DropShadow());
        root.getChildren().add(image);
    }

    public static void keyGreenRed(ImageView image, Pane root) {
        image.setFitHeight(40);
        image.setFitWidth(40);
        image.setY(597);
        image.setEffect(new DropShadow());
        image.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(image);
    }

    public static void bloodGreenRed(ImageView image, Pane root) {
        image.setFitHeight(40);
        image.setFitWidth(40);
        image.setY(597);
        image.setX(40);
        image.setEffect(new DropShadow());
        image.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(image);
    }

    public static void pistolGreenRed(ImageView image, Pane root) {
        image.setFitHeight(40);
        image.setFitWidth(40);
        image.setY(597);
        image.setX(80);
        image.setEffect(new DropShadow());
        image.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(image);
    }

    public static void diaryGreenRed(ImageView image, Pane root) {
        image.setFitHeight(40);
        image.setFitWidth(40);
        image.setY(597);
        image.setX(120);
        image.setEffect(new DropShadow());
        image.setViewport(new Rectangle2D(0, 0, 500, 500));
        root.getChildren().add(image);
    }

}
