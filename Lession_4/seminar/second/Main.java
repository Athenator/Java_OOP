package seminar.second;

public class Main {
    public static void main(String[] args) {
        Integer[] n =  {1,3,5,8,56};
        Collection<Integer> col = new Collection<Integer>(n);
        System.out.println(col);
        col.set(2, 0);
        System.out.println(col.get(0));
        System.out.println("Size = " + col.size());
        col.add(10);
        System.out.println(col);
    }
}
