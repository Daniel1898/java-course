package lesson2;

/*
Спросить у пользователя целое положительное число
Создать целочисленный массив такой же длины
С помощью цикла (for или while) заполнить этот массив по правилу:
Каждый элемент равен его индексу, умноженному на 11
После заполнения, вывести массив
Например, если пользователь введет 6, то должен получиться массив [0, 11, 22, 33, 44, 55]
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];

        for (int i = 0; i < arr_len; i++) {
            arr[i] = i * 11;
        }

        System.out.println(Arrays.toString(arr));
    }
}
