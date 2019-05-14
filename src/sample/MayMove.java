package sample;


public class MayMove {
    public static boolean boxHere(int x, int y) {
        if (Main.boxes[y / 50][x / 50]=='1') return false;
        if (Main.boxes[y / 50][(x + 40) / 50]=='1') return false;
        if (Main.boxes[(y + 50) / 50][x / 50]=='1') return false;
        if (Main.boxes[(y + 50) / 50][(x + 40) / 50]=='1') return false;
        if (Main.boxes[(y + 80) / 50][x / 50]=='1') return false;
        if (x < 0 || y < 0 || x > 1250 || y > 560) return false;
        return (Main.boxes[(y + 80) / 50][(x + 40) / 50] != '1');
    }
}
