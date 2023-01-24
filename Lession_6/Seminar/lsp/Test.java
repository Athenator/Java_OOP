package Seminar.lsp;

public class Test {
    public static void main(String[] args) {
        testRectangle(new Rectangle());

        testSquare(new Square());

        System.out.println("Тесты успешно выполнены!");
    }

    private static void testRectangle (Rectangle rect) {
        rect.setWidth(2);
        rect.setHeight(3);
        mustEqual(rect.getArea(),6); // 2 * 3 = 6
    }

    private static void testSquare(Square square) {
        square.setHeight(2);
        mustEqual(square.getArea(),4); // 2 * 2 =4

        square.setHeight(3);
        mustEqual(square.getArea(),9); // 3 * 3 = 9
    }

    private static void mustEqual (float a,float b) {
        if(Math.abs(a - b) > 0.001f)
            throw new IllegalStateException(String.format("Must equal: %f != %f", a, b));
    }
}
