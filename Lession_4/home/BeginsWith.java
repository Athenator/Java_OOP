package seminar.home;

public class BeginsWith extends isGood<String>{
    private String controlStr;

    public BeginsWith(String controlStr) {
        this.controlStr = controlStr;
    }
    public boolean   isGood (String item){
        String subStr = item.substring(0, controlStr.length());
        return controlStr.equals(subStr);
    }    
}
