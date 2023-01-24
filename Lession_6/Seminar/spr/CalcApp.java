package Seminar.spr;

public class CalcApp {
    public static void main(String[] args) {
        RectangleCalc rect = new RectangleCalc(5, 5);
        System.out.format("Area = %d\n",rect.getArea());
    }
}
