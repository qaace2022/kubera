package qaace22training;
import java.util.Scanner;
public class MethodOverloading 
{
	private static void display(String name)
    {
        System.out.println(" Name: " + name);
    }
    private static void display(int a,int b,int c)
    {
      int sum=a+b+c;
        System.out.println("Addition of 3 numbers: " + sum);
    }
   
    public static void main(String[] args) 
    {
        MethodOverloading overload=new MethodOverloading();
        overload.display("Kuberan");
        overload.display(80,50,60);
       
    }
}