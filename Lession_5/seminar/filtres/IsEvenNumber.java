package seminar.filtres;

public class IsEvenNumber implements IsGood<Integer>{

    @Override
    public boolean isGood(Integer elem) {
        return elem % 2 == 0;
    }
    
}
