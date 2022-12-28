package seminar.two;
import java.util.*;

public class BossEmployee extends Employee {

    private List<Employee> workers = new ArrayList<>();

    public BossEmployee(String name) {
        super(150000, "Босс",name);
        workers.add(new DeveloperEmployee("Вася"));
        workers.add(new DesignerEmployee("Вася"));
        workers.add(new DeveloperEmployee("Вася"));
        workers.add(new DesignerEmployee("Вася"));
        
    }


    @Override
    public void work() {
        System.out.println(getName() + " пришел и заставил работать: ");
        for (Employee employee : workers) {
            employee.work();   
            System.out.println();
        }
        
    }

}
