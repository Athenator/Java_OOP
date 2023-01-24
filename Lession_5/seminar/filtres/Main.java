package seminar.filtres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        // IsGood<Integer> isEven = new IsEvenNumber();
        // filter(numbers, isEven);

        // Iterable<Integer> evenNumber = filter(numbers, isEven);
        // for (Integer number : evenNumber) {
        //     System.out.println(number);
        // }

        IsGood<Integer> greaterThan3 = new IsGreaterThan(3);

        Iterable<Integer> bigNum = filter(numbers, greaterThan3);
        for (Integer number : bigNum) {
            System.out.println(number);
        }

    }

    private static <Elem> Iterable<Elem> filter (Iterable<Elem> collection, IsGood<Elem> isGood){
        List<Elem> filtered = new ArrayList<>();

        for (Elem elem : collection) {
            if(isGood.isGood(elem)){
                filtered.add(elem);
            }
        }

        return filtered;
    }
}
