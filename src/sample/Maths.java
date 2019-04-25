package sample;

class Maths {
    static int radius(double x1, double x2, double y1, double y2) {
        return (int)Math.sqrt(Maths.square(x1 - x2)+Maths.square(y1 - y2));

    }
    private static double square(double a) {
        return a*a;
    }
}
