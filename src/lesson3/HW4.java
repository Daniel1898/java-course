package lesson3;

import java.util.Arrays;

public class HW4 {

    static double[] arrayN(double[] arr, int n){

        double[] result = new double[n * arr.length];
        int i = 0;
        while (i < result.length) {
            for (int j = 0; j < arr.length; j++) {
                result[i] = arr[j];
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double[] arr = new double[]{6, 3, 9};
        System.out.println(Arrays.toString(arrayN(arr, 3)));
    }
}
