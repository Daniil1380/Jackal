package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application implements EventHandler<KeyEvent> {
    private Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    private Scene scene = new Scene(root, 1300, 650);
    private ImageView image = new ImageView("sample\\files\\mainChar.png");
    private ImageView enemy = new ImageView("sample\\files\\enemyP.png");
    private ImageView fog = new ImageView("sample\\files\\fog.png");

    public Main() throws IOException {
    }


    @Override
    public void start(Stage primaryStage) {
        Create.ost(root);
        Create.floor(root);
        BoxesCreate.create(root, AllOptions.mover);
        Create.character(image, root);
        Create.enemy(enemy, root);
        Create.fog(fog, root);
        Create.noir(root);
        Move.start(scene, image, enemy, fog);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Noir");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample\\files\\Icon.jpg"));
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(KeyEvent event) {

    }
}
