package sample.View;

import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.View.Box;

import java.util.Random;

public class BoxesCreate {
    public static void create(Pane root, char[][] creater) {
        int i=0;
        for(char[] chars: creater) {
            for (char z: chars) {
                Character c = z;
                if (c.equals('1')) {
                    Random random = new Random();
                    int num = random.nextInt(2);
                    ImageView image = new ImageView("sample/Files/box" + String.valueOf(num) + ".png");
                    Box.def(image, i);
                    image.setEffect(new DropShadow());
                    root.getChildren().add(image);
                }
                i++;
            }

        }
    }
}
