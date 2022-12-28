package seminar.two;

public abstract class Employee {
    private int salary;
    private String position;
    private String name;

    protected String getName() {
        return name;
    }
    
    public Employee(int salary, String position,String name) {
        this.salary = salary;
        this.position = position;
        this.name = name;
    }
    public abstract void work();

}
