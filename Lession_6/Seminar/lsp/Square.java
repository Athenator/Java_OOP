package Seminar.lsp;

public class Square extends Shape{

    @Override
    public void setWidth(float width) {
        this.height = width;
        this.width = width;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
        this.width = height;
    }
    
}
