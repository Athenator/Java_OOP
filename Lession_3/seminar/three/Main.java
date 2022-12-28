package seminar.three;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("Athena");
        lst.add("Zeus");
        lst.add("Germes");
        lst.add("Gefest");
        Iterator<String> it = lst.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
