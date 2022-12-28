package seminar.Zero;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new SquareShape(10f),
                new SquareShape(4f),
                new SquareShape(2f),
                new SquareShape(3f),
                new CircleShape(4f),
                new CircleShape(10f),
                new CircleShape(2f));

        for (Shape shape : shapes) {
            System.out.println(shape + " Area = " + shape.getArea() + " perimetr = " + shape.getPerimeter());
        }

    }
}
