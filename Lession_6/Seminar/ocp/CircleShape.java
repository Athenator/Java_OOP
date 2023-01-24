package Seminar.ocp;

public class CircleShape implements Shape{

    @Override
    public void draw() {
        System.out.println(" #");
        System.out.println("###");
        System.out.println(" #");
        System.out.println();
        
    }

    @Override
    public int priory() {
        return 0;
    }
    
}
