public class Teacher extends User{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + "]";
    }
}
