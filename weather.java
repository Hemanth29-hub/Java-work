package datatype;

import java.util.Scanner;

public class weather {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter temp :");
		int temp=src.nextInt();
		System.out.println("Enter humadity :");
		int humadity=src.nextInt();
		if(temp>=10 && temp<=45){
			if(humadity>=20 && humadity<=150)
			{
				System.out.println("we can play cricket");
			}
			else {
				System.out.println("we can't paly cricket");
			}
		}
			else {
				System.out.println("can't define");
			}
			
			
	
		src.close();
	}

}
