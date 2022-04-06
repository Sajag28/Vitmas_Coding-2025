package JAVA.Lab;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        System.out.println("Welcome to our Service");
        System.out.println("Enter 1st number");
        Scanner number = new Scanner(System.in);
        double num1 = number.nextDouble();
        System.out.println("Enter 2nd number");
        Scanner second = new Scanner(System.in);
        double num2 = second.nextDouble();
        System.out.println("Enter the operation u want to do");
        Scanner operation = new Scanner(System.in);
        String op = operation.nextLine();
        System.out.println("Processing.....");
        System.out.println("Please wait");

        double i = num1;
        double j = num2;
        switch (op) {
            case "Addition": {
                do {
                    double k = i + j;
                    System.out.println("This is the final output: " + k);
                    break;
                } while (i == num1 && j == num2);
                break;
            }

            case "Subtraction": {
                do {
                    double k = i - j;
                    System.out.println("This is the final output: " + k);
                    break;
                } while (i == num1 && j == num2);
                break;

            }

            case "Multiplication": {
                do {
                    double k = i * j;
                    System.out.println("This is the final output: " + k);
                    break;
                } while (i == num1 && j == num2);
                break;
            }

            case "Division": {
                do {
                    double k = i / j;
                    System.out.println("This is the final output: " + k);
                    break;
                } while (i == num1 && j == num2);
                break;
            }

            case default: {
                System.out.println("You have entered an invalid operation to perform!");
            }
        }
        System.out.println("I hope you got your expected answer.");
        System.out.println("Thankyou for choosing ur service");
    }

}
