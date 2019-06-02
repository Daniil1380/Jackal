package sample.Model;



import static sample.Main.*;
import static sample.Model.AllOptions.playerSpeed;
import static sample.Model.Move.*;

class SpeedBoost {
    static void start(Characters chars) {
        int x = (int) image.getX();
        int y = (int) image.getY();
        if (wCount>55 || (wCount>16 && wCount % 2 == 0) || ((wCount % 4 == 0) && wCount>0) &&
                MayMove.boxHere(x, y - 2 * playerSpeed)) {
            chars.move(0, -1 * playerSpeed);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (sCount>40 || (sCount>16 && sCount % 2 ==0) || ((sCount % 4 == 0) && sCount>0) &&
                MayMove.boxHere(x, y + 2 * playerSpeed)) {
            chars.move(0, playerSpeed);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (dCount>40 || (dCount>16 && dCount % 2 ==0) || ((dCount % 4 == 0) && dCount>0) &&
                MayMove.boxHere(x + 2 * playerSpeed, y)) {
            chars.move(playerSpeed, 0);
            x = (int) image.getX();
            y = (int) image.getY();
        }
        if (aCount>40 || (aCount>16 && aCount % 2 ==0) || ((aCount % 4 == 0) && aCount>0) &&
                MayMove.boxHere(x - 2 * playerSpeed, y)) {
            chars.move(-1 * playerSpeed, 0);
        }
    }
}
