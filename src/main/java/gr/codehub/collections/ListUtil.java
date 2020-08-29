package gr.codehub.collections;

import gr.codehub.algorithms.Prime;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class ListUtil {


    // Creating a new prime sublist without modifying the original list
    public static ArrayList<Integer> primeArrayList(List<Integer> list) {
        ArrayList<Integer> newList = new ArrayList(list);
        newList.removeIf(i -> !Prime.isPrime(i));

        return newList;
    }


    public static ArrayList<Integer> eliminateDuplicates(List<Integer> list) {
        //Eliminate the duplicates through the LinkedHashSet
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);

        //Creating a list from the Set
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        return listWithoutDuplicates;
    }


}
