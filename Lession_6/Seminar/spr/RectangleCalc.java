package Seminar.spr;

public class RectangleCalc {
    private int width,height;

    public RectangleCalc(int width, int height){
        this.width = width;
        this.height = height;
    }
    

    public int getArea () {return width * height;}


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    
}
