package homework;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class AllStudentsAttendanceView extends AttendanceView{
    public void print(List<Student> timeListofStudents) {
        System.out.println("Список студентов и их успеваимости");
        for (Student student : timeListofStudents) {
            int count = 0;
            System.out.print("Студент " + student.name + " имеет посещаемость: ");
            for (Map.Entry<LocalDate, Boolean> entry : student.attendance.entrySet()) {
                if(entry.getValue() == true) count++;
            }
            System.out.println((double)count/student.attendance.size() * 100 + "%" );
        }
        System.out.println();
    }
}
