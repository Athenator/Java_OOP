package seminar.two;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> company = new ArrayList<>();
        company.add(new DeveloperEmployee("Афина"));
        company.add(new BossEmployee("Один"));
        

        for (Employee employee : company) {
            employee.work();
        }


    }
}
