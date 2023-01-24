package seminar.Task01.util;

import java.io.FileWriter;

import seminar.Task01.data.Student;
import seminar.Task01.data.Teacher;
import seminar.Task01.service.StudentsService;
import seminar.Task01.service.TeachersService;

public class FileToWrite {

    public static void write(StudentsService students) {

        try (FileWriter file = new FileWriter("Students.txt"))
        {
            for (Student student : students.getUsers()) {
                file.write(student.toString());
            }
    
        } catch (Exception e) {

        }

    }

    public static void write(TeachersService teachers) {
        try(FileWriter file = new FileWriter("Teachers.txt")) 
        {
            for(Teacher teacher: teachers.getUsers()){
                file.write(teacher.toString());
            }
        } catch (Exception e) {
        }
    }


}
