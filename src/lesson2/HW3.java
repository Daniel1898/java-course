package lesson2;

/*
Спросить у пользователя одно целое число типа int
С помощью цикла while вывести столько же раз фразу "Цикл while"
 */

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int i = 0;

        while (i < value){
            System.out.println("Цикл while");
            i++;
        }
    }
}
