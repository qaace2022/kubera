package project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Customer1 {

	Main wholeData = new Main();

	public static void main(String[] args) {
		Customer1 obj = new Customer1();
		obj.readLocalJson();

		System.out.println("Welcome Manager ");
		System.out.println("1. Bank Administrator \n 2. Customer");

		Integer option= 0;

		do {
			Scanner Dna=new Scanner(System.in);
			int ch= Dna.nextInt();
			switch (ch) {
			case 1:
				Scanner ref=new Scanner(System.in);
				ObjectMapper objm = new ObjectMapper();

				Main ref1;
				try {
					ref1 = objm.readValue(new File ("Data/bank.json"),Main.class);
					String A,B,C,D;

					C=ref1.getAdmin().username;

					D=ref1.getAdmin().password;

					System.out.println("type username ");

					A=ref.next();

					System.out.println("type password");

					B=ref.next();

					if(A.contentEquals(C)&& B.contentEquals(D))

					{

						obj.adminLogin(obj);

					}

					else {

						System.out.println("invalid data");

					}
				} catch (StreamReadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DatabindException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				obj.customerLogin();
				break;
			default: 
				System.out.println("Login failed Please try again later");
				break;
			}
		}while(option!=1 || option!=2); 


	}

	private void adminLogin(Customer1 obj) {
		// TODO Auto-generated method stub

		Integer option =0;
		System.out.println("Hello Administrator");
		System.out.println("1. View All customer data \n 2. View All issue cards \n 3. Add new customer");
		;

		do {
			Scanner Dna=new Scanner(System.in);
			int ch;
			ch= Dna.nextInt();
			switch (ch) {
			case 1:
				obj.viewAllCustomer();
				break;
			case 2:
				obj.viewAllIssuedCard();
				break;
			case 3:
				obj.addCustomer(obj);
				break;
			default: 
				System.out.println("Please choose any option");
				break;
			}
		}while(option!=1 || option!=2 || option!=3); 
	}
	private void addCustomer(Customer1 obj) {
		// TODO Auto-generated method stub


		List<Customer> currentCustomer = (List<Customer>) wholeData.getCustomers();
		Customer customer = new Customer();
		System.out.println("Enter the Customer Id \n");
		Scanner setId=new Scanner(System.in);
		customer.setId(setId.nextInt());
		System.out.println("Enter the CustomerName \n");
		Scanner name=new Scanner(System.in);
		customer.setName(name.nextLine());
		currentCustomer.add(customer);
		viewAllCustomer();

	}

	private  void viewAllIssuedCard() {
		// TODO Auto-generated method stub
		System.out.print("No card details found");

	}

	private void viewAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> currentCustomer = (List<Customer>) wholeData.getCustomers();
		if(!currentCustomer.isEmpty()) {
			System.out.print("Customer Details \n");
			for(int i=0;i <currentCustomer.size(); i++) {
				System.out.print("\nCustomer No:"+(i+1)+"\n");
				Customer temp = currentCustomer.get(i);
				System.out.print(temp.getId());
				System.out.print(temp.getName());
			}
			System.out.print("\nn");
		}else {
			System.out.print("No customer details found");
		}
	}

	private void customerLogin() {
		// TODO Auto-generated method stub
		System.out.print("Hello Customer");
		System.out.println("\n1. View Balance \n 2. Deposite \n 3. Withdrawal \n 4.Block card");
	}

	private void readLocalJson(){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			wholeData= objectMapper.readValue(new File("/Users/kuberav/Downloads/bank.json"), Main.class);
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
