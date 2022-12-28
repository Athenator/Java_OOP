package home;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSave extends Save{
    @Override
    public void SaveAs() {
        try (FileWriter writer = new FileWriter("output.json")){
            writer.write("{\n");
            writer.write("\t\"Иван Иванов\" : 4.8,\n");
            writer.write("\t\"Мария Кузнецова\" : 5.0,\n");
            writer.write("\t\"Степан Кузьмин\" : 3.6\n");
            writer.write("}\n");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
    }
}
