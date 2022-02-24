package qaace22training;
import java.io.*;
public class PrintingStars 
{
    public static void main(String[] args)
    {

        try 
        {
            FileWriter file = new FileWriter("/Users/kuberav/Documents/JavaFileExample/pattern.txt");
            PrintWriter print = new PrintWriter(file);
            int i, j,n=4;
            for(i=0; i<n; i++)
            {
                for(j=0; j<=i; j++)
                {
                    print.print("* ");
                }
                print.println();
            }
            System.out.println("Star pattern");
            print.close();
        }

        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
