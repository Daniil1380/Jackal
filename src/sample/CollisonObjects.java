package sample;

import javafx.scene.image.ImageView;
import javafx.util.Pair;

public class CollisonObjects {
    public static boolean check(ImageView firstImage, ImageView secondImage) {
        Pair <Double, Double> point1 = new Pair<>(firstImage.getX(), firstImage.getY());
        Pair <Double, Double> point2 = new Pair<>(firstImage.getX() + firstImage.getFitWidth(), firstImage.getY());
        Pair <Double, Double> point3 = new Pair<>(firstImage.getX(), firstImage.getY() + firstImage.getFitHeight());
        Pair <Double, Double> point4 = new Pair<>(firstImage.getX() + firstImage.getFitWidth(),
                firstImage.getY() + firstImage.getFitHeight());

        Pair <Double, Double> point5 = new Pair<>(secondImage.getX(), secondImage.getY());
        Pair <Double, Double> point6 = new Pair<>(secondImage.getX() + secondImage.getFitWidth(), secondImage.getY());
        Pair <Double, Double> point7 = new Pair<>(secondImage.getX(), secondImage.getY() + secondImage.getFitHeight());
        Pair <Double, Double> point8 = new Pair<>(secondImage.getX() + secondImage.getFitWidth(),
                secondImage.getY() + secondImage.getFitHeight());


       if (point1.getKey() >= point5.getKey() && point1.getKey() <= point8.getKey() &&
               point1.getValue() >= point5.getValue() && point1.getValue() <= point8.getValue())
           return true;
        if (point2.getKey() >= point5.getKey() && point2.getKey() <= point8.getKey() &&
                point2.getValue() >= point5.getValue() && point2.getValue() <= point8.getValue())
            return true;
        if (point3.getKey() >= point5.getKey() && point3.getKey() <= point8.getKey() &&
                point3.getValue() >= point5.getValue() && point3.getValue() <= point8.getValue())
            return true;
        if (point4.getKey() >= point5.getKey() && point4.getKey() <= point8.getKey() &&
                point4.getValue() >= point5.getValue() && point4.getValue() <= point8.getValue())
            return true;

        if (point5.getKey() >= point1.getKey() && point5.getKey() <= point4.getKey() &&
                point5.getValue() >= point1.getValue() && point5.getValue() <= point4.getValue())
            return true;
        if (point6.getKey() >= point1.getKey() && point6.getKey() <= point4.getKey() &&
                point6.getValue() >= point1.getValue() && point6.getValue() <= point4.getValue())
            return true;
        if (point7.getKey() >= point1.getKey() && point7.getKey() <= point4.getKey() &&
                point7.getValue() >= point1.getValue() && point7.getValue() <= point4.getValue())
            return true;
        if (point8.getKey() >= point1.getKey() && point8.getKey() <= point4.getKey() &&
                point8.getValue() >= point1.getValue() && point8.getValue() <= point4.getValue())
            return true;
        return false;
    }
}
