package sample;


import javafx.scene.image.ImageView;

public class SpeedBoost {
    public static void start(int[] wCount, int[] sCount, int[] aCount, int[] dCount, Characters chars, ImageView image) {
        int x = (int) image.getX();
        int y = (int) image.getY();
        if (wCount[0]>55 || (wCount[0]>16 && wCount[0] % 2 ==0) || ((wCount[0] % 4 == 0) && wCount[0]>0) &&
                MayMove.boxHere(x, y - 4)) {
            chars.move(0, -2);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (sCount[0]>40 || (sCount[0]>16 && sCount[0] % 2 ==0) || ((sCount[0] % 4 == 0) && sCount[0]>0) &&
                MayMove.boxHere(x, y + 4)) {
            chars.move(0, 2);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (dCount[0]>40 || (dCount[0]>16 && dCount[0] % 2 ==0) || ((dCount[0] % 4 == 0) && dCount[0]>0) &&
                MayMove.boxHere(x+4, y)) {
            chars.move(2, 0);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (aCount[0]>40 || (aCount[0]>16 && aCount[0] % 2 ==0) || ((aCount[0] % 4 == 0) && aCount[0]>0) &&
                MayMove.boxHere(x-4, y)) {
            chars.move(-2, 0);
        }
    }
}
