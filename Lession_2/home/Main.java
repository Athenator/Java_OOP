package home;

public class Main {
    public static void main(String[] args) {
        TxtSave list = new TxtSave();
        list.SaveAs(); // Сохранение в output.txt
        JsonSave list2 = new JsonSave();
        list2.SaveAs(); // Сохранение в output.json
        XmlSave list3 = new XmlSave();
        list3.SaveAs(); // Сохранение в output.xml
    }
}
