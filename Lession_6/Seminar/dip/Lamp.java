package Seminar.dip;

public class Lamp implements Device{
    private boolean isOn;

    @Override
    public void turnOn () { isOn = true; System.out.println("Свет включен");}

    @Override
    public void turnOf () { isOn = false; System.out.println("Свет выключен");}

    @Override
    public boolean getIsOn() {
        return isOn;
    }

}
