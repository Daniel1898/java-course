package lesson4;

public class HW3 {
    public static void main(String[] args) {
        PhoneNumber number1 = new PhoneNumber();
        PhoneNumber number2 = new PhoneNumber("Домашний", 12345);
        System.out.println("Номер:" + number1.num + ", тип: " + number1.numType);
        System.out.println("Номер:" + number2.num + ", тип: " + number2.numType);
    }
}
