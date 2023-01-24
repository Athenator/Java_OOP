package seminar.Task01.View;

import seminar.Task01.data.Student;
import seminar.Task01.service.DataService;

public class StudentView implements UserView{
    private DataService<Student> model;

    public StudentView(DataService<Student> model) {
        this.model = model;
    }

    @Override
    public void print() {
        for (Student student : model.getUsers()) {
            System.out.println(student.toTable());
        }
    }

    
}
