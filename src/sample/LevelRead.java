package sample;

import java.io.*;

public class LevelRead {
    public static int[][] create(String in) throws IOException {
        int namer = 0;
        int [][] massive = new int[26][13];
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        int chars = buf.read();
        while (chars != -1) {
            massive[namer % 26][namer / 26]=(char)chars;
            chars = buf.read();
            namer++;
        }
        buf.close();
        return massive;
        }
        
}
