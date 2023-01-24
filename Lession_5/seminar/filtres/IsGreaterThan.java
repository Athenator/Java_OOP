package seminar.filtres;

public class IsGreaterThan implements IsGood<Integer>{
    private int border;

    public IsGreaterThan(int border) {
        this.border = border;
    }

    @Override
    public boolean isGood(Integer elem) {
        return elem > border;
    }

    
}
