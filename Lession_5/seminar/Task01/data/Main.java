package seminar.Task01.data;

import java.util.ArrayList;
import java.util.List;

import seminar.Task01.View.StudentView;
import seminar.Task01.controller.StudentContoller;
import seminar.Task01.service.StudentsService;
import seminar.Task01.service.TeachersService;
import seminar.Task01.util.FileToReade;
import seminar.Task01.util.FileToWrite;

public class Main {
    public static void main(String[] args) {

        // Students
        List<Student> studends = new ArrayList<>();

        Student student = new Student(1, "Ruse", 3.4f, "2514");
        Student student2 = new Student(2, "Gor", 4.2f, "5245");
        Student student3 = new Student(3, "Avalon", 3.8f, "5524");
        Student student4 = new Student(4, "Appolo", 4.3f, "6653");
        Student student5 = new Student(5, "Ippolit", 5.0f, "2441");
        studends.add(student);
        studends.add(student2);
        studends.add(student3);
        studends.add(student4);
        studends.add(student5);

        StudentsService studentsService = new StudentsService(studends);

        FileToWrite.write(studentsService);

        FileToReade reader = new FileToReade();
        List<Student> students = reader.studentReader();
        for(Student std: students)
        System.out.println(std);

        
        // StudentView sv = new StudentView(studentsService);
        // sv.print();
        
        StudentContoller sc = new StudentContoller();
        // StudentContoller sc = new StudentContoller(sv,students);
        sc.start();

        // Teachers

        // List<Teacher> teachers = new ArrayList<>();

        // Teacher teacher = new Teacher(1, "Людмила", "Директор", "Отсутсвуют");
        // Teacher teacher2 = new Teacher(2, "Мария", "Преподаватель", "Философия, Исскусство");
        // Teacher teacher3 = new Teacher(3, "Александр", "Заместитель директора", "История");
        // Teacher teacher4 = new Teacher(4, "Родион", "Преподаватель", "МХК");

        // teachers.add(teacher);
        // teachers.add(teacher2);
        // teachers.add(teacher3);
        // teachers.add(teacher4);

        // TeachersService teachersService = new TeachersService(teachers);

        // FileToWrite.write(teachersService);

        // FileToReade reader = new FileToReade();
        // List<Teacher> teacheri = reader.teacherReader();
        // for(Teacher tch: teacheri)
        // System.out.println(tch);

    }
}
