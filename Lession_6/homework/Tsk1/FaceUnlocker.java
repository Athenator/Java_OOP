package homework.Tsk1;

public class FaceUnlocker implements Unlocker {
    String faceId;

    public FaceUnlocker(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public void unlock() {
        if(faceId == "Перед камерой моё лицо"){
            System.out.println("Камера распознала ваше лицо и телефон разблокировался.");
        }else if(faceId == "Перед камерой чужое лицо") {
            System.out.println("Камера не распознала лицо и телефон всё ещё заблокирован.");
        }else {
            System.out.println("Вы ввели некоорректные данные!");
        }
    }


}
