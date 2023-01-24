package Seminar.dip;

public class Switch{

    private Device device;

    public Switch(Device device) {
        this.device = device;
    }


    public void toggle () {
        if(device.getIsOn())
            device.turnOf();
        else 
            device.turnOn();
    }
}
