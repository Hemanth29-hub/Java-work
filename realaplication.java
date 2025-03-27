package datatype;

import java.util.Scanner;

public class realaplication {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int choice;
        int age;
        int tickets;
        double price = 0;

        do {
            System.out.println("\nMovie Ticket Booking:");
            System.out.println("\t1.Regular seat(100)");
            System.out.println("\t2.Balacony seat(150)");
            System.out.println("\t3.VIP seat(200)");
            System.out.println("\t4.Exit");
            System.out.println("Choose your seat type: ");
            choice = scr.nextInt();

            if (choice >= 1 && choice <= 3) 
            {
                System.out.println("Enter number of tickets: ");
                tickets = scr.nextInt();
                System.out.println("Enter age: ");
                age = scr.nextInt();

                switch (choice) {
                    case 1:
                        price = 100 * tickets;
                        break;
                    case 2:
                        price = 150 * tickets;
                        break;
                    case 3:
                        price = 200 * tickets;
                        break;
                }

                
                double discount = 0;
                if (age <= 10) {
                    discount = 0.20 * price;
                } else if (age >= 60) {
                    discount = 0.15 * price;
                }

                double finalPrice = price - discount;
                System.out.println("Total Price: rs" + price);
                System.out.println("Discount: rs" + discount);
                System.out.println("Final Price: rs" + finalPrice);
                System.out.println("Thank you for Ticket Booking!");
            } else if (choice != 4) {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);
        scr.close();
        
        
    }
}
