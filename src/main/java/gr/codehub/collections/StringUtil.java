package gr.codehub.collections;

public class StringUtil {

    public static String reverseString(String str) {
        int len = str.length();
        char[] result = new char[len];
        Stack reversed = new Stack(len);
        int i;
        for (i = 0; i < len; i++)
            reversed.push(str.charAt(i));
        for (i = 0; i < len; i++) {
            char ch = reversed.pop();
            result[i] = ch;
        }

        return new String(result);
    }

    public static boolean isSymmetric(String str) {
        int len = str.length();
        //Ignoring case sensitive comparison
        String strLower = str.toLowerCase();

        for (int i = 0; i < len / 2; i++) {
            if (strLower.charAt(i) != strLower.charAt(len - i - 1))
                return false;
        }
        return true;
    }


    public static int descendingOrderDigits(int n) {
        int len = Integer.toString(n).length();
        int a[] = new int[len];
        int i = 0;

        //number to Array
        while (n != 0) {
            a[i] = n % 10;
            n /= 10;
            i++;
        }

        //Array in Descending Order
        for (i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        String result = "";
        for (i = 0; i < len; i++)
            result += a[i];

        int desc = Integer.parseInt(result);

        return desc;
    }

}
