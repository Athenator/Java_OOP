package seminar.second;

import java.util.Arrays;
import java.util.Random;

public class Collection<T> {
    private T[] array;

    public Collection(T[] array) {
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public void set (T value, int index){
        array[index] = value;
    }

    public int size() {
        return array.length;
    }
    public void add(T newvalue){
        T[] newarray = (T[]) new Object[this.size() +1];
        for (int i = 0; i < size(); i++) {
            newarray[i] = array[i];
        }
        newarray[size()] = newvalue;
        array = newarray;
        
    }

    @Override
    public String toString() {
        return "Collection [array = " + Arrays.toString(array) + "]";
    }
}
