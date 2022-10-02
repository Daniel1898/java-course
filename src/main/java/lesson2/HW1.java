package lesson2;

import java.util.Scanner;
/*
Спросить у пользователя число с помощью Scanner
Если оно попадает в диапазон от 1 до 100 или в диапазон от -1000 до -100, вывести в консоль "+"
Если оно не попадает ни в один из этих диапазонов, вывести "-"
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value >= 1 && value <= 100
                || value >= -1000 && value <= -100){
            System.out.println('+');
        } else {
            System.out.println('-');
        }
    }
}
