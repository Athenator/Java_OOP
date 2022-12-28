package seminar.home;

public class BeginsWithA extends isGood<String>{
    public boolean   isGood (String item){
        return item.indexOf("A")==0;
    }
}
