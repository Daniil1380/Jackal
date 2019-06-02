package sample.Model;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import static sample.Main.*;


class Health {
    static void change(ImageView enemyF, int i) {
        if (CollisionObjects.check(enemyF, image) && hp>0 && enemyF.isVisible()) {
            if (hp<i) hp=0;
            else hp-=i;
            health.setFitWidth(hp+1);
            health.setViewport(new Rectangle2D(0, 0, hp*5, 100));
        }
    }

}
