package sample.View;

import javafx.geometry.Rectangle2D;
import static sample.Main.*;
import static sample.Model.Move.*;


public class AnimationChar {

    public static void start() {
        int playerW = 176;
        int playerH = 360;
        int speedAnimation = 6;
        int[] frames = {7, 7, 6, 6, 5, 5}; //количество кадров в анимации
        if (wCount !=0) {
            if (wCount % speedAnimation == 0) image.setViewport(new Rectangle2D(wCount / speedAnimation % frames[0] * playerW,
                    playerH * 2, playerW, playerH));
        }
        else if (sCount!=0) {
            if (sCount % speedAnimation == 0) image.setViewport(new Rectangle2D(sCount / speedAnimation % frames[1] * playerW,
                    playerH * 5, playerW, playerH));
        }
        else if (aCount!=0) {
            if (aCount % speedAnimation == 0) image.setViewport(new Rectangle2D(aCount / speedAnimation % frames[2] * playerW,
                    playerH * 3, playerW, playerH));
        }
        else if (dCount!=0) {
            if (dCount % speedAnimation == 0) image.setViewport(new Rectangle2D(dCount / speedAnimation % frames[3] * playerW,
                    playerH * 4, playerW, playerH));
        }
        else  if (count % speedAnimation == 0) {
            if (lastRight) image.setViewport(new Rectangle2D(count / speedAnimation % frames[4] * playerW, playerH, playerW, playerH));
            else image.setViewport(new Rectangle2D(count / speedAnimation % frames[5] * playerW, 0, playerW, playerH));
        }
    }
}
