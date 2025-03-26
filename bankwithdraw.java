package datatype;

import java.util.Scanner;

public class bankwithdraw {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount=src.nextInt();
		if(amount<=10000 && amount>=500)
			System.out.println("OTP NotRequired");
		else if(amount>=10000 && amount<=50000) {
			System.out.println("OTP Required");
		}
		else {
			System.out.println("Not Eligible");
		}
		src.close();
		}

}
