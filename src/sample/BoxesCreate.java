package sample;

import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.Random;

public class BoxesCreate {
    public static void create(Pane root, String creater) {
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
            if (c.equals('2')) {
                ImageView image = new ImageView("sample\\files\\died.png");
                Box.def(image, i);
                root.getChildren().add(image);
            }
        }
    }
}
