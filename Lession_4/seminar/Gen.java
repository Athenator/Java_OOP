package seminar;

import java.util.*;

public class Gen {
    public static void main(String[] args) {
        List<Integer> integer = Arrays.asList(1,2,3,4,5);

        printTs(integer);
        // printObjects(integer);
    }

    public static <T> void printTs (List<T> items){
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void printObjects (List<Object> items){
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
