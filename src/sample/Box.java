package sample;

import javafx.scene.image.ImageView;

public class Box {

    public static void def(ImageView image, int i) {
        image.setFitWidth(50);
        image.setFitHeight(50);
        image.setX(50 * (i % 26));
        image.setY(50 * (i / 26));
    }
}
