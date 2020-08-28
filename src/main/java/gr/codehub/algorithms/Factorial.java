package gr.codehub.algorithms;

public class Factorial {

    public static long factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }


    public static int maxIntFactorial() {
        int result = 2;
        long factorial = 2;
        while (factorial > 0) {
            result++;
            factorial *= result;
        }
        return --result;
    }

}
