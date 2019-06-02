package sample.Model;


import javafx.geometry.Rectangle2D;

import static sample.Main.*;

class GiveItem {
    static void check() {
       if (CollisionObjects.check(image, pistol) && pistol.isVisible()) {
           take.stop();
           take.play();
           pistol.setVisible(false);
           pistolGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
       }
        if (CollisionObjects.check(image, key) && key.isVisible()) {
            take.stop();
            take.play();
            key.setVisible(false);
            keyGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
        if (CollisionObjects.check(image, diary) && diary.isVisible()) {
            take.stop();
            take.play();
            diary.setVisible(false);
            diaryGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
        if (CollisionObjects.check(image, blood) && blood.isVisible()) {
            take.stop();
            take.play();
            blood.setVisible(false);
            bloodGreenRed.setViewport(new Rectangle2D(500, 0, 500, 500));
        }
    }
}
