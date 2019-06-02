package sample.Control;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import static sample.Model.Move.*;

public class KeyPress {

    public static void check(Scene scene) {
        scene.setOnKeyPressed(ke -> {

            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w = true;
            } else if (keyCode.equals(KeyCode.S)) {
                s = true;
            } else if (keyCode.equals(KeyCode.A)) {
                a = true;
                lastRight = false;
            } else if (keyCode.equals(KeyCode.D)) {
                d = true;
                lastRight = true;
            }
        });

        scene.setOnKeyReleased(ke -> {
            KeyCode keyCode = ke.getCode();
            if ((keyCode.equals(KeyCode.W))) {
                w = false;
            } else if (keyCode.equals(KeyCode.S)) {
                s = false;
            } else if (keyCode.equals(KeyCode.A)) {
                a = false;
            } else if (keyCode.equals(KeyCode.D)) {
                d = false;
            }
        });
    }
}

