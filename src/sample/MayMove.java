package sample;

public class MayMove {
    public static boolean boxHere(int x, int y) {
        String move= "10011000000100111000100111" +
                "00011000000100001000000100" +
                "00000000000100001000000100" +
                "00000000100100001000000100" +
                "11000000100100111000111100" +
                "11000000100000000000110000" +
                "10000100000000000000000000" +
                "10001100000000000000000000" +
                "00001100111111001100000000" +
                "00000000000000000111100000" +
                "00000000010000000000000000" +
                "00010000010000000000000100" +
                "00111110011101000000011111" +
                "0000000000000000000000000000000000000000000000000000" +
                "000000000000000000000000000000000000000000000000000000000000000000000000000000";
        boolean test = true;
        int numberInStr = y / 50 * 26 + x / 50;
        if (move.charAt(numberInStr)=='1') test = false;
        if (move.charAt(numberInStr+26)=='1')test = false;
        if ((move.charAt(numberInStr+1)=='1') && (x % 50 != 0)) test = false;
        if ((move.charAt(numberInStr+27)=='1') && (x % 50 != 0)) test = false;
        if ((move.charAt(numberInStr+52)=='1') && (y % 50 != 0)) test = false;
        if ((move.charAt(numberInStr+53)=='1') && (y % 50 != 0)&& (x % 50 != 0)) test = false;
        if (x < 0 || y < 0 || y > 550 || x > 1250) test = false;
        return test;
    }
}
