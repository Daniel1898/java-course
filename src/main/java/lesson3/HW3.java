package lesson3;

import java.util.Arrays;

public class HW3 {

    static void doubleElements(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void main(String[] args) {

        double[] arr = new double[]{6, 3, 9, 23, 44, 595};
        System.out.println(Arrays.toString(arr));
        doubleElements(arr);
        System.out.println(Arrays.toString(arr));

    }
}
