package seminar.Task01.data;

public abstract class User {
    protected int id;
    protected String name;
    
    
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return id + "," + name;
    }
}
