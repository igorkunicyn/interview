package lesson_1_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Drawable triangle = new Triangle();
        Drawable square = new Square();
        Drawable circle = new Circle();
        List<Drawable> snaps = Arrays.asList(triangle,square,circle);
        for (Drawable snap: snaps) {
            snap.draw();
        }
    }
}
