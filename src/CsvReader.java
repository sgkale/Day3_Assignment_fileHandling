import java.io.*;

public class CsvReader {

    private String COMMA=",";
    private String NEWLINE="\n";
    //private FileInputStream reader;
    private String data;
    private String[] tempData;
    private BufferedReader reader;
    Details obj;
    int i;

    CsvReader(){
        this.data="";
    }

    public void readFile(){
        try {
            reader=new BufferedReader(new FileReader("Details.txt"));
            while ((data=reader.readLine())!=null){
                tempData=data.split(COMMA);
                if(tempData.length>0)
                {
                    int id= Integer.parseInt(tempData[0]);
                    String name=tempData[1];
                    String location=tempData[2];
                    System.out.println("EmpId = "+id+" Name = "+name+" Location = "+location);

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
