package Seminar.spr;

public class GraphicApp {
    public static void main(String[] args) {
        RectangleGraph rGraph = new RectangleGraph(new RectangleCalc(6, 6));
        rGraph.draw();
    }
}
