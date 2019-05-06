package sample;


import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.ArrayList;

public class GiveItem {
    public void check(ImageView image, ImageView pistol, ImageView blood, ImageView diary, ImageView key, MediaPlayer take,
                      ImageView bloodGreenRed, ImageView diaryGreenRed, ImageView keyGreenRed, ImageView pistolGreenRed) {
       if (CollisonObjects.check(image, pistol) && pistol.isVisible()) {
           take.stop();
           take.play(); //максимально странный баг, все намерто зависает, когда собираешь предмет((((( на долю секунды
           pistol.setVisible(false);
           pistolGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
       }
        if (CollisonObjects.check(image, key) && key.isVisible()) {
            take.stop();
            take.play();
            key.setVisible(false);
            keyGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
        if (CollisonObjects.check(image, diary) && diary.isVisible()) {
            take.stop();
            take.play();
            diary.setVisible(false);
            diaryGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
        if (CollisonObjects.check(image, blood) && blood.isVisible()) {
            take.stop();
            take.play();
            blood.setVisible(false);
            bloodGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
    }
}
