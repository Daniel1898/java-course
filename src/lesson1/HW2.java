package lesson1;

public class HW2 {
    public static void main(String[] args) {
        int number = 3647;
        number = ((number + 3) * 123 - number) * 45;
        if (number > 1000000){
            System.out.println("Большое число");
        }
        else{
            System.out.println("Небольшое число");
        }
    }
}
