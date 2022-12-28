package home;

import java.io.FileWriter;
import java.io.IOException;

public class XmlSave extends Save{
    @Override
    public void SaveAs() {
        try (FileWriter writer = new FileWriter("output.xml")){
            writer.write("<?xml version=\"1.0\" encoding = \"utf-8\" ?>\n");
            writer.write("<students>\n");
            writer.write("\t<student>\n");
            writer.write("\t\t<name>Иван Иванов</name>\n");
            writer.write("\t\t<grade>4.8</grade>\n");
            writer.write("\t</student>\n");
            writer.write("\t<student>\n");
            writer.write("\t\t<name>Мария Кузнецова</name>\n");
            writer.write("\t\t<grade>5.0</grade>\n");
            writer.write("\t</student>\n");
            writer.write("\t<student>\n");
            writer.write("\t\t<name>Степан Кузьмин</name>\n");
            writer.write("\t\t<grade>3.6</grade>\n");
            writer.write("\t</student>\n");
            writer.write("</students>\n");

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
    }
}
