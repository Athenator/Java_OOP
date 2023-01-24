package Seminar.ocp;

public class SquareShapeVer2 implements Shape{
    private char color;

    public SquareShapeVer2(char color) {
        this.color = color;
    }

    
    @Override
    public void draw() {
        System.out.printf("%c%c%c\n", color,color,color);
        System.out.printf("%c%c%c\n", color,color,color);
        System.out.printf("%c%c%c\n", color,color,color);
        System.out.println();
    }


    @Override
    public int priory() {
        // TODO Auto-generated method stub
        return 0;
    }
}
