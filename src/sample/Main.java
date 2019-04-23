package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application implements EventHandler<KeyEvent> {
    private ImageView image = new ImageView("sample\\files\\mainChar.png");
    private Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    public Scene scene = new Scene(root, 1300, 650);
    private ImageView enemy = new ImageView("sample\\files\\enemyP.png");
    private ImageView fog = new ImageView("sample\\files\\fog.png");
    private String mover=
            "10011000000100111000100111" +
                    "00011000000100001000000100" +
                    "00000000000100001000000100" +
                    "00000000100100001000000100" +
                    "11000000100100111000111100" +
                    "11000000100000000000110000" +
                    "10000100000000000000000000" +
                    "10001100000000000000000000" +
                    "00001100111111001100000000" +
                    "00000000000000000111100000" +
                    "00000000010000000000000000" +
                    "00010000010000000000000100" +
                    "00111110011101000000011111" +
                    "0000000000000000000000000000000000000000000000000000" +
                    "000000000000000000000000000000000000000000000000000000000000000000000000000000";

    public Main() throws IOException {
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView main = new ImageView("sample\\files\\theme.png");
        main.setY(0);
        main.setY(0);
        main.setFitHeight(650);
        main.setFitWidth(1300);
        root.getChildren().add(main);
        image.setFitHeight(100);
        image.setFitWidth(50);
        image.setY(550);
        image.setEffect(new DropShadow());
        enemy.setFitHeight(50);
        enemy.setFitWidth(50);
        enemy.setY(600);
        enemy.setX(1250);
        fog.setFitHeight(1300);
        fog.setFitWidth(2600);
        fog.setY(-50);
        fog.setX(-1250);
        root.getChildren().add(image);
        BoxesCreate.create(root, mover);
        primaryStage.setTitle("Jackal");
        Move.start(scene, image, enemy, fog);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample\\files\\Icon.jpg"));
        root.getChildren().add(fog);
        root.getChildren().add(enemy);
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(KeyEvent event) {

    }
}
