package lesson7;


import java.io.*;
import java.util.Scanner;

public class Main {
    static void hw1(){
        try(FileInputStream in = new FileInputStream("./src/lesson7/hw12.txt");
            FileOutputStream out = new FileOutputStream("./src/lesson7/hw12_copy.txt")){

            int b = in.read();

            int fileSize = 0;

            while (b != -1){
                fileSize++;
                out.write(b);
                b = in.read();
            }
            System.out.printf("Файл скопирован, всего скопировано %d байт", fileSize);

        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи");
        }
    }

    static void hw2(){
        try(FileReader in = new FileReader("./src/lesson7/hw12.txt");
            FileWriter out = new FileWriter("./src/lesson7/hw12_copy_text.txt")){

            int b = in.read();

            int fileSize = 0;

            while (b != -1){
                fileSize++;
                out.write(b);
                b = in.read();
            }
            System.out.printf("Файл скопирован, всего скопировано %d байт\n", fileSize);

        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи");
        }
    }

    static void hw3(){
        try(FileInputStream in = new FileInputStream("./src/lesson7/numbers.txt")){

            Scanner sc = new Scanner(in);
            double sum = 0;
            int numCount = 0;

            while (sc.hasNextInt() || sc.hasNextDouble()){
                if (sc.hasNextInt()){
                    sum += sc.nextInt();
                    numCount++;
                }
                if (sc.hasNextDouble()) {
                    sum += sc.nextDouble();
                    numCount++;
                }
            }
            System.out.printf("%-10.3f\n", sum/numCount);

        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи");
        }
    }

    public static void main(String[] args) {
        hw1();
        hw2();
        hw3();
    }
}
