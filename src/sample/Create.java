package sample;

import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Create {
    public static void fog(ImageView fog, Pane root) {
        fog.setFitHeight(1300);
        fog.setFitWidth(2600);
        fog.setY(-50);
        fog.setX(-1250);
        root.getChildren().add(fog);
    }

    public static void enemy(ImageView enemy, Pane root) {
        enemy.setFitHeight(50);
        enemy.setFitWidth(50);
        enemy.setY(600);
        enemy.setX(1250);
        root.getChildren().add(enemy);
    }

    public static void character(ImageView image, Pane root) {
        image.setFitHeight(100);
        image.setFitWidth(50);
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

    public static void ost(Pane root) {
        String file = "src\\sample\\files\\mainTheme.mp3";
        Media sound = new Media(new File(file).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }


}
