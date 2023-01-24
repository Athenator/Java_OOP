package seminar.Task01.data;

public class Student extends User{

    private float avgMark;
    private String group;
    
    public Student(int id, String name, float avgMark, String group) {
        super(id, name);
        this.avgMark = avgMark;
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + "," + avgMark + "," + group + "\n";
    }
    
    public String toTable() {
        return String.format("%2i %15s %10f %15s \n", id,name,avgMark,group);
    }
}
