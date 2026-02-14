package Day9;

import java.util.Scanner;

public class doWhileLoop {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Cake");
            System.out.println("4. Coffee");
            System.out.println("5. Matcha");
            System.out.println("Select your choice from 1 to 5:");
            choice = s.nextInt();
        } while (!(choice >= 1 && choice <= 5));
        System.out.println("Order placed :)");
    }
}
