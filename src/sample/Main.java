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
import sample.Model.Move;
import sample.View.BoxesCreate;
import sample.View.Create;
import sample.View.LevelRead;

import java.io.File;
import java.io.IOException;

public class Main extends Application implements EventHandler<KeyEvent> {
    public static char[][] boxes;
    static {
        try {
            boxes = LevelRead.create("src/sample/Files/level.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    Scene scene = new Scene(root, 1300, 650);
    public static ImageView image = new ImageView("sample/Files/mainChar.png");
    public static ImageView enemy = new ImageView("sample/Files/enemyP.png");
    public static ImageView fog = new ImageView("sample/Files/fog.png");
    public static ImageView diedText = new ImageView("sample/Files/diedText.png");
    public static ImageView health = new ImageView("sample/Files/health.png");
    public static ImageView pistol = new ImageView("sample/Files/pistol.png");
    public static ImageView blood = new ImageView("sample/Files/blood.png");
    public static ImageView diary = new ImageView("sample/Files/diary.png");
    public static ImageView key = new ImageView("sample/Files/key.png");
    public static ImageView keyGreenRed = new ImageView("sample/Files/keyGreenRed.png");
    public static ImageView pistolGreenRed = new ImageView("sample/Files/pistolRedGreen.png");
    public static ImageView diaryGreenRed = new ImageView("sample/Files/diaryRedGreen.png");
    public static ImageView bloodGreenRed = new ImageView("sample/Files/bloodRedGreen.png");
    public static ImageView text = new ImageView("sample/Files/text.png");
    public static ImageView film = new ImageView("sample/Files/film.jpg");
    private static String file = "src/sample/Files/die.mp3";
    private static Media sound = new Media(new File(file).toURI().toString());
    public static MediaPlayer media = new MediaPlayer(sound);
    private static String takeS = "src/sample/Files/take.mp3";
    private static Media mediaS = new Media(new File(takeS).toURI().toString());
    public static MediaPlayer take = new MediaPlayer(mediaS);
    public static int hp = 200;
    static private String f = "src/sample/Files/ost.mp3";
    static private Media s = new Media(new File(f).toURI().toString());
    public static MediaPlayer ost = new MediaPlayer(s);
    public static ImageView bang = new ImageView("sample/Files/fireBall.png");
    static private String exc = "src/sample/Files/pain.mp3";
    static private Media ex = new Media(new File(exc).toURI().toString());
    public static MediaPlayer explosive = new MediaPlayer(ex);
    static private String winer = "src/sample/Files/win.mp3";
    static private Media wine = new Media(new File(winer).toURI().toString());
    public static MediaPlayer win = new MediaPlayer(wine);



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
        Move.start(scene);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Noir");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample/Files/Icon.jpg"));
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(KeyEvent event) {

    }
}
