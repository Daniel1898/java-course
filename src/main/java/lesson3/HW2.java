package lesson3;


import java.util.Scanner;

public class HW2 {
    static int add(int a, int b){
        return a + b;
    }

    static int prod(int a, int b){
        return a * b;
    }

    static int negative(int a){
        return -a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(prod(negative(c), add(a, b)));
    }
}
