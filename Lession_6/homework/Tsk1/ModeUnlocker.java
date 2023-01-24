package homework.Tsk1;

public class ModeUnlocker implements Unlocker{
    private int mode;

    

    public ModeUnlocker(int mode) {
        this.mode = mode;
    }

    @Override
    public void unlock() {
        if(mode == 1) {
            System.out.println("Вы переключили телефон в разблокированный режим");
        }else if(mode == 0){
            System.out.println("Вы переключили телефон в заблокированный режим");
        } else {
            System.out.println("Вы ввели некорректные данные!");
        }
    }
    
}
