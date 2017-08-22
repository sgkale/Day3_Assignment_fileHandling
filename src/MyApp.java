import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        String data="";
        BufferedReader reader = null;
        BufferedReader reader2 = null;
        Scanner sc=new Scanner(System.in);
        String[] option=null;
        int option2;
        try {
            reader2=new BufferedReader(new FileReader("Input.txt"));
            option=reader2.readLine().split(",");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            reader=new BufferedReader(new FileReader("Options.txt"));
            while ((data=reader.readLine())!=null){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        int j=0;
        do{

            System.out.println("Select option :");
            option2=Integer.parseInt(option[j]);
            switch (option2){
                case 1:
                    Details[] details=new Details[5];
                    CsvWriter writer=new CsvWriter();
                    for(int i= 0;i<2;i++){
                        try {
                            details[i] = new Details();
                            System.out.println("Reading id");
                            details[i].setEmpId(Integer.parseInt(reader2.readLine()));
                            System.out.println("Reading name");
                            details[i].setName(reader2.readLine());
                            System.out.println("Reading Location");
                            details[i].setLocation(reader2.readLine());
                            writer.writeDate(details[i]);
                        }catch (Exception e){

                        }
                    }
                    j++;
                    break;
                case 2:
                    CsvReader csvReader=new CsvReader();
                    csvReader.readFile();
                    j++;
                    break;
                default:
                     break;
            }

        }while (option2!=3);

    }
}
