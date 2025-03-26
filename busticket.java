package datatype;

import java.util.Scanner;

public class busticket {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Tell age :");
		int age=src.nextInt();
		if(age>=45 && age<=120) 
		{
			
			System.out.println("Ticket rate decrease upto 75% ");
			
		}
		else {
			System.out.println("Ticket rate will be no change");
		}
		src.close();
		
	}

}
