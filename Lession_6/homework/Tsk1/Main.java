package homework.Tsk1;

public class Main {
    public static void main(String[] args) {
        // Вписать в строку цифру 1, для разблокированного режима телефона.
        // Вписать в строку цифру 0, для заблокированного режима телефона.
        ModeUnlocker mUnlocker = new ModeUnlocker(0);
        mUnlocker.unlock();

        // Вписать в строку: "Мой палец", для разблокировки устройства.
        // Вписать в строку: "Чужой палец", для неудачной разблокировки устройства.
        FingerUnlocker fUnlocker = new FingerUnlocker("Чужой палец");
        fUnlocker.unlock();

        // Вписать в строку: "Перед камерой моё лицо", для разблокировки устройства.
        // Вписать в строку: "Перед камерой чужое лицо", для неудачной разблокировки
        // устройства.
        FaceUnlocker faUnlocker = new FaceUnlocker("Перед камерой чужое лицо");
        faUnlocker.unlock();

        // Вписать в строку цифры 1234, для разблокировки телефона.
        // Вписать в строку любые другие цифры, для неудочной разблокировки.
        PinUnlocker pUnlocker = new PinUnlocker(1234);
        pUnlocker.unlock();
    }
}
