package seminar;

import java.util.Arrays;

interface Shape {
    float getArea ();
}

class SquareSwhape implements Shape {
    private float side;

    public SquareSwhape(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    
}

class CircleShape implements Shape {
    float radius;

    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {

        return (float) Math.PI * radius * radius;
    }

    class Main {
        public static void main(String[] args) {
            Iterable<Shape> shapes = Arrays.asList(
                new SquareSwhape(1),
                new CircleShape(1)
            );

            for (Shape shape : shapes) {
                System.out.println(shape.getArea());
            }
        }
    }

    
}