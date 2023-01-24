package Seminar.lsp;

public abstract class Shape {
    protected float width;
    protected float height;

    
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }

    public abstract void setWidth(float width); 
    
    public abstract void setHeight(float height); 

    public float getArea() {
        return width * height;
    }
    
  
    

}
