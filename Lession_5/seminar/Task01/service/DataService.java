package seminar.Task01.service;


import java.util.List;

import seminar.Task01.data.User;

public interface DataService<U extends User> {
    public void add(U user);
    
    public List<U> getUsers();

}
