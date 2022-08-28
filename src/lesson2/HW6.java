package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя целое число N
создать треугольник высотой N
(возможно запускать цикл в цикле)
Пример: N = 5               N = 3
*                           *
**                          **
***                         ***
****
*****
 */

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
