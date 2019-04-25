package sample;

public class MayMove {
    public static boolean boxHere(int x, int y) {
        boolean test = true;
        int numberInStr = y / 50 * 26 + x / 50;
        if (AllOptions.mover.charAt(numberInStr)=='1') test = false;
        if (AllOptions.mover.charAt(numberInStr+26)=='1')test = false;
        if ((AllOptions.mover.charAt(numberInStr+1)=='1') && (x % 50 != 0)) test = false;
        if ((AllOptions.mover.charAt(numberInStr+27)=='1') && (x % 50 != 0)) test = false;
        if ((AllOptions.mover.charAt(numberInStr+52)=='1') && (y % 50 != 0)) test = false;
        if ((AllOptions.mover.charAt(numberInStr+53)=='1') && (y % 50 != 0)&& (x % 50 != 0)) test = false;
        if (x < 0 || y < 0 || y > 550 || x > 1250) test = false;
        return test;
    }
}
