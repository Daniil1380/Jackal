package sample;

import java.io.*;

public class LevelRead {
    public static char[][] create(String in) throws IOException {
        int namer = 0;
        char [][] massive = new char[13][26];
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        int chars = buf.read();
        while (chars != -1) {
            if (chars != '\n' && chars != '\r') {
                massive[namer / 26][namer % 26] = (char) chars;
                namer++;
            }
            chars = buf.read();
        }
        buf.close();
        return massive;
        }
        
}
