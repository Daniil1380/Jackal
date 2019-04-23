package sample;

import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.Random;

public class BoxesCreate {
    String creater = "101010000010101000001010110000101011000010101000001010100000101010000010101000";
    public static void create(Pane root, String creater) {
        for(int i = 0, n = creater.length() ; i < n ; i++) {
            Character c = creater.charAt(i);
            if (c.equals('1')) {
                Random random = new Random();
                int num = random.nextInt(2);
                ImageView image = new ImageView("sample\\files\\box" + String.valueOf(num) + ".png");
                image.setX(50 * (i % 26));
                image.setY(50 * (i / 26));
                image.setFitWidth(50);
                image.setFitHeight(50);
                image.setEffect(new DropShadow());
                root.getChildren().add(image);
            }
        }
    }
}
