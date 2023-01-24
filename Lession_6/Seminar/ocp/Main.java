package Seminar.ocp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
            new SquareShape(),
            new CircleShape(),
            new SquareShape(),
            new CircleShape(),
            new TriangleShape(),
            new SquareShapeVer2('$'));

        // shapes.sort();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
