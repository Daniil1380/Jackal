package sample;

import javafx.geometry.Rectangle2D;
import static sample.Main.*;


public class AnimationChar {
    public static void start(int[] wCount, int[] sCount, int[] dCount, int[] aCount, int[] count, boolean[] lastRight) {
        if (wCount[0]!=0) {
            if (wCount[0] % 5 == 0) image.setViewport(new Rectangle2D(wCount[0] / 5 % 7 * 176, 720, 176, 360));
        }
        else if (sCount[0]!=0) {
            if (sCount[0] % 6 == 0) image.setViewport(new Rectangle2D(sCount[0] / 6 % 7 * 176, 1800, 176, 360));
        }
        else if (aCount[0]!=0) {
            if (aCount[0] % 6 == 0) image.setViewport(new Rectangle2D(aCount[0] / 6 % 6 * 176, 1080, 176, 360));
        }
        else if (dCount[0]!=0) {
            if (dCount[0] % 6 == 0) image.setViewport(new Rectangle2D(dCount[0] / 6 % 6 * 176, 1440, 176, 360));
        }
        else  if (count[0] % 6 == 0) {
            if (lastRight[0]) image.setViewport(new Rectangle2D(count[0] / 6 % 5 * 176, 360, 176, 360));
            else image.setViewport(new Rectangle2D(count[0] / 6 % 5 * 176, 0, 176, 360));
        }
    }
}
