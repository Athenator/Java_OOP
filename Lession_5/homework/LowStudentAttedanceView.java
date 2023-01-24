package homework;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class LowStudentAttedanceView extends AttendanceView{
    public void print(List<Student> timeListofStudents){
        System.out.println("Список студентов, имеющих низкую успеваимость (менее 25%)");
        for (Student student : timeListofStudents) {
            int count = 0;
            for (Map.Entry<LocalDate,Boolean> entry: student.attendance.entrySet()) {
                if(entry.getValue() == true) count ++;

            }
            if((double) count/student.attendance.size() <= 0.25) {
                System.out.print("Студент " + student.name + " имеет посещаемость ");
                System.out.println((double) count/student.attendance.size()*100 + "%");
            }
        }
        System.out.println();
    }
}
