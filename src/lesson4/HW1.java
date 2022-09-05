package lesson4;

import java.util.Arrays;

public class HW1 {

    static void sinArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.sin(arr[i]);
        }
    }

    public static void main(String[] args) {
        double[] arr = new double[]{3, 4.33, 6.28, 11};
        sinArr(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
