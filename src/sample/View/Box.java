package sample.View;

import javafx.scene.image.ImageView;

import static sample.Model.AllOptions.blockInRow;
import static sample.Model.AllOptions.sizeBlock;

public class Box {

    public static void def(ImageView image, int i) {
        image.setFitWidth(sizeBlock);
        image.setFitHeight(sizeBlock);
        image.setX(sizeBlock * (i % blockInRow));
        image.setY(sizeBlock * (i / blockInRow));
    }
}
