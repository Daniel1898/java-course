package lesson2;

/*
Спросить у пользователя три дробных числа a,b,c
Посчитать корни квадратного уравнения a*x*x + b*x + c = 0
Math.sqrt(n) - квадратный корень
дискриминант:
< 0 - нет корней
= 0 - 1 корень
> 0 - 2 корня
 */

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0){
            System.out.println("Нет корней.");
        } else if (d == 0) {
            double x = (-1 * b + Math.sqrt(d))/(2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-1 * b + Math.sqrt(d))/(2 * a);
            double x2 = (-1 * b - Math.sqrt(d))/(2 * a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        }
    }
}
