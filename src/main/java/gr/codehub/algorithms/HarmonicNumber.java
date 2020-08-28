package gr.codehub.algorithms;

public class HarmonicNumber {

    public static float nthSum(int n){
        float sum = 1;
        for (int i=2;i<=n;i++){
            sum += (float) 1/ (float) i;
        }
        return sum;
    }
}
