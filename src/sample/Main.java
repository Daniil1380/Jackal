package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
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
    static char[][] boxes;
    static {
        try {
            boxes = LevelRead.create("src\\sample\\files\\Level.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    Scene scene = new Scene(root, 1300, 650);
    static ImageView image = new ImageView("sample\\files\\mainChar.png");
    static ImageView enemy = new ImageView("sample\\files\\enemyP.png");
    static ImageView fog = new ImageView("sample\\files\\fog.png");
    static ImageView diedText = new ImageView("sample\\files\\DiedText.png");
    static ImageView health = new ImageView("sample\\files\\health.png");
    static ImageView pistol = new ImageView("sample\\files\\pistol.png");
    static ImageView blood = new ImageView("sample\\files\\blood.png");
    static ImageView diary = new ImageView("sample\\files\\diary.png");
    static ImageView key = new ImageView("sample\\files\\key.png");
    static ImageView keyGreenRed = new ImageView("sample\\files\\keyGreenRed.png");
    static ImageView pistolGreenRed = new ImageView("sample\\files\\pistolRedGreen.png");
    static ImageView diaryGreenRed = new ImageView("sample\\files\\diaryRedGreen.png");
    static ImageView bloodGreenRed = new ImageView("sample\\files\\bloodRedGreen.png");
    static ImageView text = new ImageView("sample\\files\\text.png");
    static ImageView film = new ImageView("sample\\files\\film.jpg");
    private static String file = "src\\sample\\files\\die.mp3";
    private static Media sound = new Media(new File(file).toURI().toString());
    static MediaPlayer media = new MediaPlayer(sound);
    private static String takeS = "src\\sample\\files\\take.mp3";
    private static Media mediaS = new Media(new File(takeS).toURI().toString());
    static MediaPlayer take = new MediaPlayer(mediaS);
    static int[] hp = {200};
    static private String f = "src\\sample\\files\\ost.mp3";
    static private Media s = new Media(new File(f).toURI().toString());
    static MediaPlayer ost = new MediaPlayer(s);
    static ImageView bang = new ImageView("sample\\files\\fireBall.png");
    static private String exc = "src\\sample\\files\\pain.mp3";
    static private Media ex = new Media(new File(exc).toURI().toString());
    static MediaPlayer explosive = new MediaPlayer(ex);
    static private String winer = "src\\sample\\files\\win.mp3";
    static private Media wine = new Media(new File(winer).toURI().toString());
    static MediaPlayer win = new MediaPlayer(wine);



    public Main() throws IOException {
    }



    @Override
    public void start(Stage primaryStage) throws IOException {
        explosive.play();
        explosive.stop();
        win.play();
        win.stop();
        bang.setFitHeight(30);
        bang.setFitWidth(30);
        ost.play();
        take.play();
        take.stop();
        take.setVolume(40);
        Create.floor(root);
        BoxesCreate.create(root, boxes);
        Create.character(root);
        Create.enemy(root);
        Create.key(root);
        Create.pistol(root);
        Create.blood(root);
        Create.diary(root);
        root.getChildren().add(bang);
        Create.fog(root);
        Create.noir(root);
        Create.keyGreenRed(root);
        Create.bloodGreenRed(root);
        Create.diaryGreenRed(root);
        Create.pistolGreenRed(root);
        Create.healthFrame(root);
        Create.health(root);
        Create.film(root);
        Create.text(root);
        Create.diedText(root);
        Move.start(scene, root);
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
