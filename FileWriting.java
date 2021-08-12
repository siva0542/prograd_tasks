import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws Exception {
        File f=new File("AutoBio.txt");
        if(f.createNewFile()){
            System.out.println(f.getName()+" file created successfully.");
        }
        else{
            System.out.println("File already created on the directory");
        }
        FileWriter f1=new FileWriter("AutoBio.txt");
        f1.write("I am the devil of your life");
        File print=new File("AutoBio.txt");
        Scanner sc=new Scanner(print);
        while(sc.hasNextLine()){
            String s1=sc.nextLine();
            System.out.println(s1);
        }

    }
}
