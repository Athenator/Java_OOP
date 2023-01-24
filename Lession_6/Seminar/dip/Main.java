package Seminar.dip;

public interface Main {
    public static void main(String[] args) {
        Device lamp = new Lamp();  
        Device lamp2 = new Lamp();
        Switch sw = new Switch(lamp);
        Switch sw2 = new Switch(lamp2);

        sw.toggle();
        sw2.toggle();
        
    }
}
