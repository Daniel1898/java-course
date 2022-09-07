package lesson4;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int privetCount = 0;
        int privetPosition = str.indexOf("привет");
        while (privetPosition != -1){
            privetCount++;
            str = str.replaceFirst("привет", "");
            privetPosition = str.indexOf("привет");
        }
        if (privetCount == 1){
            System.out.println("Слово \"привет\" встречается единожды");
        } else if (privetCount > 1){
            System.out.println("Слово \"привет\" встречается больше 1 раза");
        } else {
            System.out.println("Слово \"привет\" не встречается");
        }
    }
}
