package seminar.first;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Student> listStudents = new ArrayList<>() ;
        listStudents.add(new Student("Иванов", LocalDate.of(2001, 12, 19), 4.9f));
        listStudents.add(new Student("Сергеев", LocalDate.of(2000, 02, 12), 3.9f));
        listStudents.add(new Student("Макаров", LocalDate.of(2002, 10, 29), 3.8f));
        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}
