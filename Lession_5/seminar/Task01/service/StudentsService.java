package seminar.Task01.service;

import java.util.ArrayList;
import java.util.List;

import seminar.Task01.data.Student;

public class StudentsService implements DataService <Student>{
    private List<Student> students = new ArrayList<>();


    public StudentsService(List<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getUsers() {
        List<Student> copy = new ArrayList<>();
        for (Student student : students) {
            copy.add(student);
        }
        return copy;
    }





    
}
