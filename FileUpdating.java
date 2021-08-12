import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUpdating {
    public static void main(String[] args) throws Exception {
        FileWriter f=new FileWriter("Bio.txt",true);
        f.write("I am the devil of my life.");
        f.close();
        File read=new File("Bio.txt");
        Scanner sc=new Scanner(read);
        while(sc.hasNextLine()){
            String s1=sc.nextLine();
            System.out.println(s1);
        }

    }
}
