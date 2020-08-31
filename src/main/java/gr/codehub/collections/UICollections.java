package gr.codehub.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UICollections {


    public void startCollections() {
        infoListApp();
        List<Integer> list = scanIntList();
        printListSection(list);

        infoIntApp();
        int numbers = getInteger();
        printIntSection(numbers);

        infoStringApp();
        String text = getString();
        printStringSection(text);

    }

    private void printIntSection(int numbers) {
        System.out.println("Original number: " + numbers);
        System.out.println("Digits of the number in descending order: " + StringUtil.descendingOrderDigits(numbers));
    }

    private void printListSection(List<Integer> list) {
        System.out.println("The list A you entered is: " + list.toString());
        System.out.println("The prime sublist of A:\n" + ListUtil.primeArrayList(list).toString());
        System.out.println("List A without duplicates: " + ListUtil.eliminateDuplicates(list).toString());
    }

    private void printStringSection(String text) {
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + StringUtil.reverseString(text));
        System.out.println("Is the original string Symmetric: " + StringUtil.isSymmetric(text));
    }

    private void infoListApp() {
        System.out.println("List Utils:");
        System.out.println("1. Returns the Prime sublist of the one, you'll enter");
        System.out.println("2. Returns the list without duplicates");
    }

    private void infoStringApp() {
        System.out.println("_________");
        System.out.println("String Utils:");
        System.out.println("Reversed String");
        System.out.println("Checks if it's symmetric");
    }


    private void infoIntApp() {
        System.out.println("_________");
        System.out.println("Int Utils:");
        System.out.println("Returns the Digits of the number in descending order");
    }

    private String getString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String str = scanner.nextLine();
        return str;
    }


    private int getInteger() {
        int n;
        System.out.println("Give an Integer: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an Integer!");
            System.out.println("Give an Integer: ");
            scanner.next();
        }
        n = scanner.nextInt();
        return n;
    }


    private List<Integer> scanIntList() {
        List<Integer> list = new ArrayList<>();
        System.out.println("Add an Integer to list A: ");
        do {
            int n = getInteger();
            list.add(n);
        } while (continueAdding());

        return list;
    }

    private boolean continueAdding() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add more Integers? (y = yes)");
        String n = scanner.nextLine();
        if (n.equals("y"))
            return true;
        return false;

    }


}
