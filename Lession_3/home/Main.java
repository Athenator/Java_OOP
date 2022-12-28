package home;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Сергеев", LocalDate.of(1999, 8, 9), 4.9f));
        listStudents.add(new Student("Александров", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Михайлов", LocalDate.of(1999, 1, 13), 3.1f));
        listStudents.add(new Student("Синичкин", LocalDate.of(2006, 10, 19), 4.9f));
        listStudents.add(new Student("Клоч", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Алесов", LocalDate.of(1998, 1, 13), 3.1f));

        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
            System.out.println("-------------------------------");
        
    }
}