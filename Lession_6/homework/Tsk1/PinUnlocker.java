package homework.Tsk1;

public class PinUnlocker implements Unlocker{
    private int pin;

    public PinUnlocker(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock() {
        if(pin == 1234){
            System.out.println("Вы ввели верный код, телефон разблокирован");
        }else {
            System.out.println("Вы ввели неверный код, телефон до сих пор заблокирован!");
        }
    }
    
}
