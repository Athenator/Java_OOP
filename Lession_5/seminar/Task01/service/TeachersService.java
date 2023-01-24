package seminar.Task01.service;

import java.util.ArrayList;
import java.util.List;

import seminar.Task01.data.Teacher;

public class TeachersService implements DataService<Teacher>{

    private List<Teacher> teachers = new ArrayList<>();

    public TeachersService(List<Teacher> teachers) {
        this.teachers = teachers;
    }


    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getUsers() {
        List<Teacher> copy = new ArrayList<>();
        for (Teacher teacher : teachers) {
            copy.add(teacher);
        }
        return copy;
    }




}
