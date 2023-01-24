package homework.Tsk1;

public class FingerUnlocker implements Unlocker{
    private String finger;

    public FingerUnlocker(String finger) {
        this.finger = finger;
    }

    @Override
    public void unlock() {
        if(finger == "Мой палец") {
            System.out.println("Вы переключили телефон в разблокированный режим с помощью зарегистрированного пальца.");
        }else if(finger == "Чужой палец"){
            System.out.println("Телефон заблокирован, вы приложили ненакомый палец.");
        }else {
            System.out.println("Ошибка использования способа разблокировки! Введите корректные данные!");
        }
    }

}

