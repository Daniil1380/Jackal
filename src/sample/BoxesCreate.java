package sample;

import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

public class BoxesCreate {
    public static void create(Pane root, String creater) {
        ArrayList<String> detective = new ArrayList<>();
        detective.add("pistol");
        detective.add("blood");
        detective.add("key");
        for(int i = 0, n = creater.length() ; i < n ; i++) {
            Character c = creater.charAt(i);
            if (c.equals('1')) {
                Random random = new Random();
                int num = random.nextInt(2);
                ImageView image = new ImageView("sample\\files\\box" + String.valueOf(num) + ".png");
                Box.def(image, i);
                image.setEffect(new DropShadow());
                root.getChildren().add(image);
            }
            if (c.equals('4')) {
                ImageView image = new ImageView("sample\\files\\door.png");
                image.setFitWidth(50);
                image.setFitHeight(10);
                image.setX(50 * (i % 26));
                image.setY(50 * (i / 26));
                root.getChildren().add(image);
            }
        }
    }
}
