package homework;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<Student> timeListofStudents = new ArrayList<>();

    public AttendanceService(List<Student> timeList) {
        this.timeListofStudents = timeList;
    }

    public List<Student> getTimeListofStudents(){
        return timeListofStudents;
    }
}
