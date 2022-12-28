package seminar.two;

public class DesignerEmployee extends Employee{

    public DesignerEmployee(String name) {
        super(50000, "Веб - дизайнер", name);
        
    }

    @Override
    public void work() {
        System.out.println("Дизайнер " + getName() + " запустил фотошоп");
        System.out.println("Дизайнер работает");
        
    }
    
}
