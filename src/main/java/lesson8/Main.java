package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static void hw1(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Синий");
        colors.add("Желтый");
        colors.add("Голубой");
        colors.add("Зеленый");
        colors.add("Розовый");

        System.out.println(colors);
        colors.remove("Синий");
        System.out.println(colors);
        String removedColor = colors.get(2);
        colors.remove(2);
        System.out.println(colors);
        colors.add(0,"Синий");
        colors.add(1,removedColor);
        System.out.println(colors);

    }

    static void hw2(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println(set);
    }

    static void hw3(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            numMap.put(k, (numMap.getOrDefault(k, 0) + 1));
        }

        System.out.println(numMap);
    }

    public static void main(String[] args) {
        hw1();
        hw2();
        hw3();
    }
}
