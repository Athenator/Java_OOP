package seminar.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable <Student>{
    private List<Student> students;

    public int getSize(){
        return students.size();
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }
    public Student get(int i){
        return students.get(i);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    
}
