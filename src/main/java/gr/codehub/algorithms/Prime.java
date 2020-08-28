package gr.codehub.algorithms;

public class Prime {

    public static boolean isPrime(long n) {
        long halfNumber = n / 2;

        if (n == 0 || n == 1)
            return false;

        for (int i = 2; i <= halfNumber; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
