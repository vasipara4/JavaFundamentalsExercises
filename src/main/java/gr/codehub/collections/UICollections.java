package gr.codehub.collections;

import java.util.ArrayList;

public class UICollections {


    private ArrayList<Integer> list = new ArrayList<>();
    private int numbers;
    private String text;

    public UICollections(){
        //initialize instance variables
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(9);

        numbers = 124985435;

        text = "AbdBa";
    }

    public void startCollections(){
        System.out.println("The list A is: " + list.toString());
        System.out.println("The prime sublist of A:\n" + ListUtil.primeArrayList(list).toString());
        System.out.println("List A without duplicates: " + ListUtil.eliminateDuplicates(list).toString());
        System.out.println("Original number: " + numbers);
        System.out.println("Digits of the number in descending order: "+ StringUtil.descendingOrderDigits(numbers));
        System.out.println("Original String: "+ text);

        System.out.println("Reversed String: " + StringUtil.reverseString(text));
        System.out.println("Is the original string Symmetric: " + StringUtil.isSymmetric(text));

    }



}
