package sample.View;

import java.io.*;

import static sample.Model.AllOptions.blockInColumn;
import static sample.Model.AllOptions.blockInRow;

public class LevelRead {
    public static char[][] create(String in) throws IOException {
        int namer = 0;
        char [][] massive = new char[blockInColumn][blockInRow];
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        int chars = buf.read();
        while (chars != -1) {
            if (chars != '\n' && chars != '\r') {
                massive[namer / blockInRow][namer % blockInRow] = (char) chars;
                namer++;
            }
            chars = buf.read();
        }
        buf.close();
        return massive;
        }
        
}
