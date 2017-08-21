import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        String data="";
        BufferedReader reader = null;
        Scanner sc=new Scanner(System.in);
        int option;

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
        do{
            System.out.println("Select option :");
            option=sc.nextInt();
            switch (option){
                case 1:
                    Details[] details=new Details[5];
                    CsvWriter writer=new CsvWriter();
                    for(int i= 0;i<2;i++){
                        details[i]=new Details();
                        System.out.println("Enter id");
                        details[i].setEmpId(sc.nextInt());
                        System.out.println("Enter name");
                        details[i].setName(sc.next());
                        System.out.println("Enter Location");
                        details[i].setLocation(sc.next());
                        writer.writeDate(details[i]);
                    }
                    break;
                case 2:
                    CsvReader csvReader=new CsvReader();
                    csvReader.readFile();
                    break;
                default:
                     break;
            }
        }while (option!=3);

    }
}
