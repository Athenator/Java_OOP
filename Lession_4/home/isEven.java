package seminar.home;
// IsEven — ему дают целое число, он одобряет его, если оно чётное
public class isEven extends isGood<String>{
    public boolean   isGood (Integer item){
        return item%2 == 0;
    }  
}
