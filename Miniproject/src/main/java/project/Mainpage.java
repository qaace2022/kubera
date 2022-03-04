package project;

import java.io.File;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Mainpage{

	public static void main(String[] args) throws Exception
	{
		Scanner Dna=new Scanner(System.in);

		System.out.println("select the user type ");
		System.out.println("1. Admin\n 2. customer");
		int ch;
		ch= Dna.nextInt();
		switch (ch) {
		case 1 :
			ObjectMapper Str = new ObjectMapper();
			Main Dna1 = Str.readValue(new File ("bank.json"),Main.class);
			String A,B,C,D;
			C=Dna1.getAdmin().username;
			D=Dna1.getAdmin().password;
			System.out.println("Type valid username ");
			A=Dna.next();
			System.out.println("Type valid password");
			B=Dna.next();
			if(A.contentEquals(C)&& B.contentEquals(D))
			{
				Manager.main(args);
			}
			else 
			{
				System.out.println("Invalid data");
			}
			break;
		case 2:
			Customer1.main(args);
			break;
		}
		Dna.close();
	}

}

