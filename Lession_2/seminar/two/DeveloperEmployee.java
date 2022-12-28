package seminar.two;

public class DeveloperEmployee extends Employee{

    

    public DeveloperEmployee(String name) {
        super(70000, "Backend - программист",name);
    }

    @Override
    public void work() {
        System.out.println("Программист " + getName() + " запустил программу");
        System.out.println("Программист пишет код");
        
    }

    
}
