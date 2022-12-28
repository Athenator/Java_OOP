package seminar.first;

import java.util.Random;

public class Triple<T,A,B> {
    private T one;
    private A two;
    private B three;
    
    public Triple(T one, A two, B three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }



    public T getOne() {
        return one;
    }

    public A getTwo() {
        return two;
    }

    public B getThree() {
        return three;
    }

    @Override
    public String toString() {
        return "Triple [one=" + one + ", two=" + two + ", three=" + three + "]";
    }
}
