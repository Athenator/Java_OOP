package homework;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AttendanceService serv = new AttendanceService( Arrays.asList(
            new Student("Мария",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 2, 8) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , false, LocalDate.of(2020, 11, 11) , false)) ,
            new Student("Мира",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 1, 10) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , false, LocalDate.of(2020, 11, 11) , true)),
            new Student("Алексей",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 1, 10) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , true, LocalDate.of(2020, 11, 11) , true))
            )
        ); 

        AllStudentsAttendanceView view1 = new AllStudentsAttendanceView();

        LowStudentAttedanceView view2 = new LowStudentAttedanceView();

        SortedAdttendanceView view3 = new SortedAdttendanceView();
        
        Presenter presenter1 = new Presenter(view1, serv);
        presenter1.run();

        Presenter presenter2 = new Presenter(view2, serv);
        presenter2.run();

        Presenter presenter3 = new Presenter(view3, serv);
        presenter3.run();
        
    }
}
