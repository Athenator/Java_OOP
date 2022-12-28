package seminar.first;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer,String>(10, "Athena");
        Triple<Integer,String,String> p2 = new Triple<Integer,String,String>(25, "Year", "Age");
        Triple<Integer,Integer,Integer> pr = new Triple<Integer,Integer,Integer>(null, null, null);
        pr = getRend();
        
        System.out.println(pr);
    }

    public static Triple<Integer,Integer,Integer> getRend(){
        Random rnd = new Random();
        Triple<Integer,Integer,Integer> r = new Triple<Integer,Integer,Integer>(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
        return r;
    }
}
