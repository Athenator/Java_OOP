package seminar.Task01.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import seminar.Task01.data.Student;
import seminar.Task01.data.Teacher;

public class FileToReade {
    public List<Student> studentReader(){
        List<Student> students = new ArrayList<>();
        String strOffile = null;

        try {
            File file = new File("Students.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            strOffile = reader.readLine();
            while (strOffile != null) {
                String[] strarray = strOffile.split(",");
                Student stred = new Student(Integer.parseInt(strarray[0]), strarray[1], Float.parseFloat(strarray[2]), strarray[3]);
                students.add(stred);
                strOffile = reader.readLine();
            }
            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return students;
    }

    public List<Teacher> teacherReader(){
        List<Teacher> teachers = new ArrayList<>();
        String strOffile = null;

        try {
            File file = new File("Teachers.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            strOffile = reader.readLine();

            while (strOffile != null) {
                String[] strarray = strOffile.split(",");
                Teacher stred = new Teacher(Integer.parseInt(strarray[0]), strarray[1],strarray[2],strarray[3]);
                teachers.add(stred);
                strOffile = reader.readLine();
            }
            
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teachers;
    }
}
