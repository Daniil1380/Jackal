package sample;

import java.util.HashSet;

public class MayMove {
    public static boolean boxHere(int x, int y) {
        HashSet <Integer> blocks= new HashSet<Integer>();
        blocks.add( y / 50 * 26 + x / 50);
        blocks.add( y / 50 * 26 + (x + 40) / 50);
        blocks.add(( y + 50) / 50 * 26 + x / 50);
        blocks.add(( y + 50) / 50 * 26 + (x + 40) / 50);
        blocks.add((y + 80) / 50 * 26 + x / 50);
        blocks.add((y + 80) / 50 * 26 + (x+40) / 50);
        for (int i:blocks) {
            if (AllOptions.mover.charAt(i)=='1') return false;
        }
        if (x < 0 || x > 1300 - 40 || y < 0 || y > 650 - 80) return false;
        return true;
    }
}
