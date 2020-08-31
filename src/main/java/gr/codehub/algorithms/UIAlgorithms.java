package gr.codehub.algorithms;

import java.util.Scanner;

public class UIAlgorithms {

    public void startAlgorithms() {
        do {
            menuInfo();
            String answer = getString();
            menuCases(answer);
        } while (continueToMenu());
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    private int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an Integer!");
            System.out.println("Give an Integer: ");
            scanner.next();
        }
        int n = scanner.nextInt();
        return n;
    }

    private long getLong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a long number: ");
        while (!scanner.hasNextLong()) {
            System.out.println("That's not a Long!");
            System.out.println("Give a Long: ");
            scanner.next();
        }
        long n = scanner.nextLong();
        return n;
    }
    private float getFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a float number: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("That's not a Float!");
            System.out.println("Give a Float: ");
            scanner.next();
        }
        float n = scanner.nextFloat();
        return n;
    }

    private void menuInfo() {
        System.out.println("Menu:");
        System.out.println("1.  Calculate factorial of a number");
        System.out.println("2.  Print the maximum value of n as int so\n" +
                "that the calculated factorial output is valid");
        System.out.println("3.  Check if a number is prime");
        System.out.println("4.  Calculate the harmonic sum of a number");
        System.out.println("5.  Count the digits of a long number");
        System.out.println("6.  Given a positive float number, print its decimal part.");
        System.out.println("Type anything else for exit");
        System.out.println("Select: ");
    }

    private void menuCases(String selection) {
        int inputInt;
        float inputFloat;
        long inputLong;
        switch (selection) {
            case "1":
                inputInt = getInteger();
                System.out.println("Result: " + Factorial.factorial(inputInt));
                break;
            case "2":
                System.out.println("The maximum value of n as int so that the calculated output is valid:\n" + Factorial.maxIntFactorial());
                break;
            case "3":
                inputInt = getInteger();
                System.out.println("Prime: " + Prime.isPrime(inputInt));
                break;
            case "4":
                inputInt = getInteger();
                System.out.println("Sum: " + HarmonicNumber.nthSum(inputInt));
                break;
            case "5":
                inputLong = getLong();
                System.out.println("The digits are: " + Digits.countDigits(inputLong));
                break;
            case "6":
                inputFloat = getFloat();
                System.out.println("Result: " + Digits.decimalPart(inputFloat));
                break;
            default:
                System.out.println("Bye bye");
                System.exit(1);
                break;
        }
    }

    private boolean continueToMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to go to Menu? (y = yes)");
        String n = scanner.nextLine();
        if (n.equals("y"))
            return true;
        return false;

    }
}
