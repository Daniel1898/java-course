package lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void HW4(){
        Scanner sc = new Scanner(System.in);
        boolean isInputException;
        do {
            isInputException = false;
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(Math.sqrt(x) / Math.sqrt(y));

            } catch (ArithmeticException e){
                System.out.println("Деление на ноль, нет ответа");
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не целые числа, попробуйте снова");
                sc.nextLine();
                isInputException = true;
            }
        } while (isInputException);
    }

    public static void HW5(){
        Scanner sc = new Scanner(System.in);
        boolean isInputException;
        do {
            isInputException = false;
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x < 0 || y < 0){
                    throw new InputNotPositiveException();
                }
                System.out.println(Math.sqrt(x) / Math.sqrt(y));

            } catch (InputNotPositiveException e) {
                isInputException = true;
                System.out.println("Вы ввели неположительное число, попробуйте снова");
            } catch (ArithmeticException e){
                System.out.println("Деление на ноль, нет ответа");
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не целые числа, попробуйте снова");
                sc.nextLine();
                isInputException = true;
            }
        } while (isInputException);
    }

    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.Print();
        Plane p2 = new Plane("Boing", "736", 384.2);
        p2.Print();
        System.out.println(p2.travel(3));

        HW4();
        System.out.println("HW5");
        HW5();
    }
}
