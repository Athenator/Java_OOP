package Seminar.ocp;

public class TriangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("    #");
        System.out.println("   ###");
        System.out.println("  #####");
        System.out.println(" #######");
        System.out.println("#########");
        System.out.println();
    }

    @Override
    public int priory() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
