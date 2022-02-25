package qaace22training;
import java.util.Scanner;
public class StudetDetails
{
	public static void main(String args[])
	{
		String name;
		int roll, math, phy, che,bio,eng;           
		Scanner SC=new Scanner(System.in);     
		System.out.print("Enter Name: ");
		name=SC.nextLine();
		System.out.print("Enter Roll Number: ");
		roll=SC.nextInt();
		System.out.print("Enter marks in Maths, Physics, Chemistry, Biology,English: ");
		math=SC.nextInt();
		phy=SC.nextInt();
		che=SC.nextInt();
		bio=SC.nextInt();
		eng=SC.nextInt();
		int total=math+phy+che+bio;
		float perc=(float)total/500*100;
		System.out.println("Roll Number:" + roll +"\tName: "+name);
		System.out.println("Marks (Maths, Physics, Chemistry,Biology,English): " +math+","+phy+","+che+","+bio+","+eng);
		System.out.println("Total: "+total +"\tPercentage: "+perc);

	}

}