package gr.codehub;

import gr.codehub.algorithms.*;
import gr.codehub.collections.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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
}
