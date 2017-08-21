import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

    private String COMMA=",";
    private String NEWLINE="\n";
    private FileWriter writer;
    public void writeDate(Details details)
    {
        try {
            writer=new FileWriter("Details.txt",true);
            writer.append(Integer.toString(details.getEmpId()));
            writer.append(COMMA);
            writer.append(details.getName());
            writer.append(COMMA);
            writer.append(details.getLocation());
            writer.append(NEWLINE);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
