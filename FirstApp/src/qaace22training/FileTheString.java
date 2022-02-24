package qaace22training;
import java.util.*;
import java.io.*;
public class FileTheString
{
    public static void main(String[] args) 
    {

        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The String : ");
        name = s.nextLine();
        try 
        {
            File file = new File("/Users/kuberav/Documents/JavaFileExample/out.txt");
            FileWriter k=new FileWriter(file);
            k.write(name);
            k.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

        s.close();

    }

}