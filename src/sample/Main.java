package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
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
    private ImageView health = new ImageView("sample\\files\\health.png");
    private ImageView pistol = new ImageView("sample\\files\\pistol.png");
    private ImageView blood = new ImageView("sample\\files\\blood.png");
    private ImageView diary = new ImageView("sample\\files\\diary.png");
    private ImageView key = new ImageView("sample\\files\\key.png");
    private ImageView keyGreenRed = new ImageView("sample\\files\\keyGreenRed.png");
    private ImageView pistolGreenRed = new ImageView("sample\\files\\pistolRedGreen.png");
    private ImageView diaryGreenRed = new ImageView("sample\\files\\diaryRedGreen.png");
    private ImageView bloodGreenRed = new ImageView("sample\\files\\bloodRedGreen.png");
    private String file = "src\\sample\\files\\lol.mp3";
    private Media sound = new Media(new File(file).toURI().toString());
    private MediaPlayer media = new MediaPlayer(sound);
    private String takeS = "src\\sample\\files\\take.mp3";
    private Media mediaS = new Media(new File(takeS).toURI().toString());
    private MediaPlayer take = new MediaPlayer(mediaS);
    private int[] hp = {200};


    public Main() throws IOException {
    }


    @Override
    public void start(Stage primaryStage) {
        Create.floor(root);
        BoxesCreate.create(root, AllOptions.mover);
        Create.character(image, root);
        Create.enemy(enemy, root);
        Create.key(key, root);
        Create.pistol(pistol, root);
        Create.blood(blood, root);
        Create.diary(diary, root);
        Create.fog(fog, root);
        Create.noir(root);
        Create.keyGreenRed(keyGreenRed, root);
        Create.bloodGreenRed(bloodGreenRed, root);
        Create.diaryGreenRed(diaryGreenRed, root);
        Create.pistolGreenRed(pistolGreenRed, root);
        Create.healthFrame(root);
        Create.health(health, root);
        Move.start(scene, image, enemy, fog, pistol, blood, diary, key, hp, health, media, take, pistolGreenRed,
                bloodGreenRed, diaryGreenRed, keyGreenRed);
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
