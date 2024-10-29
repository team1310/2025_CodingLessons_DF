package hello;

import java.util.Scanner;

//inporting the scanner
public class Adder {

    static Scanner      scanner  = new Scanner(System.in);
    static final double TAX_RATE = .13;

    public static void main(String[] args) {

        System.out.println("Please enter the cost");
        double cost = scanner.nextDouble();
        System.out.println("Taxes " + (cost * TAX_RATE));
        System.out.println("Total cost with tax " + (cost + cost * TAX_RATE));
        System.out.println("Can you please enter a tip");
        double tip = scanner.nextDouble();
        System.out.println("Total with tip " + (cost + tip + cost * TAX_RATE));
    }
}
