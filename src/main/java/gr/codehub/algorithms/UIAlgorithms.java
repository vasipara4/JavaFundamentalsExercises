package gr.codehub.algorithms;

import gr.codehub.collections.PrimeList;

import java.util.ArrayList;
import java.util.Scanner;

public class UIAlgorithms {

    public void startAlgorithms() {
        String answer;
        do {
            menuInfo();
            answer = getString();
            menuCases(answer);
        } while (continueToMenu());


        System.out.println(Factorial.factorial(123));
        System.out.println("The maximum value of n as int so that the calculated output is valid:\n" + Factorial.maxIntFactorial());
        System.out.println(Prime.isPrime(5));
        System.out.println(HarmonicNumber.nthSum(4));

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        primes = (ArrayList<Integer>) PrimeList.primeArrayList(numbers);
        System.out.println(primes.toString());
        System.out.println(numbers.toString());
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    private int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer: ");
        String n = scanner.nextLine();
        return Integer.parseInt(n);
    }

    private long getLong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a long number: ");
        String n = scanner.nextLine();
        return Long.parseLong(n);
    }
    private float getFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a float number: ");
        String n = scanner.nextLine();
        return Float.parseFloat(n);
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
