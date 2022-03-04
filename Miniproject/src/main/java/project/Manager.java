package project;

import java.io.File;
import java.util.Scanner;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Manager
{
	public static void main(String[] args) throws Exception
	{
		Scanner Dna=new Scanner(System.in);

		System.out.println("Welcome Manager ");
		System.out.println("1. View all customer details\n 2. Add new Customer\n 3.Issue new card\n 4.View blocked cards\n 5.Block cards");
		int ch;
		ch= Dna.nextInt();
		switch (ch) {
		case 1:
			ObjectMapper Str = new ObjectMapper();
			Main Dna1 = Str.readValue(new File ("bank.json"),Main.class);
			for(Customer AK:Dna1.getCustomers()) {
				System.out.println(	AK.getId());
				System.out.println(AK.getName());
				System.out.println(AK.getCards().size());
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		}
	}
}
