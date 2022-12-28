package home;

import java.io.FileWriter;
import java.io.IOException;

public class TxtSave extends Save{

    @Override
    public void SaveAs() {
        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write("Просто текст: \n\n");
            writer.write("Иван Иванов = 4.8\n");
            writer.write("Мария Кузнецова = 5.0\n");
            writer.write("Степан Кузьмин = 3.6\n");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
    }
   
}
