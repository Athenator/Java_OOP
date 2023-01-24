package Ex003Math.Mathematics.Shapes;

public class Square extends Shape {
    
    public Square() {}

    private int side;

    public static Square create(int side, String name) {
        var instance = new Square();
        instance.name = name;

        instance.side = side;
        return instance;
    }


    @Override
    public double getArea() {
        
        return this.side * this.side;
    }


    @Override
    public String toString() {
        return  "Name: " + name + " Side: " + side + "Area = " + getArea();
    }

}
