package sample.Model;


import sample.Main;

import static sample.Model.AllOptions.*;
import static sample.Model.Move.*;

class MayMove {
    static boolean boxHere(int x, int y) {
        if (Main.boxes[y / sizeBlock][x /sizeBlock]=='1') return false;
        if (Main.boxes[y / sizeBlock][(x + charWidth) / sizeBlock]=='1') return false;
        if (Main.boxes[(y + sizeBlock) / sizeBlock][x / sizeBlock]=='1') return false;
        if (Main.boxes[(y + sizeBlock) / sizeBlock][(x + charWidth) / sizeBlock]=='1') return false;
        if (Main.boxes[(y + charHeight) / sizeBlock][x / sizeBlock]=='1') return false;
        if (x < 0 || y < 0 || x > (width - charWidth - 10)|| y > (height - charHeight - 10)) return false;
        return (Main.boxes[(y + charHeight) / sizeBlock][(x + charWidth) / sizeBlock] != '1');
    }

    static void check(int x, int y, Characters chars) {
        if (w && MayMove.boxHere(x, y - 2 * playerSpeed)) {
            chars.move(0, -1 * playerSpeed);
            wCount++;
        } else wCount = 0;
        if (s && MayMove.boxHere(x, y + 2 * playerSpeed)) {
            chars.move(0, playerSpeed);
            sCount++;
        } else sCount = 0;
        if (a && MayMove.boxHere(x - 2 * playerSpeed, y)) {
            chars.move(-1 * playerSpeed, 0);
            aCount++;
        } else aCount = 0;
        if (d && MayMove.boxHere(x + 2 * playerSpeed, y)) {
            chars.move(playerSpeed, 0);
            dCount++;
        } else dCount = 0;
    }
}
