package lesson4;

public class HW4 {
    public static void main(String[] args) {
        PhoneNumber number1 = new PhoneNumber();
        PhoneNumber number2 = new PhoneNumber("Домашний", 12345);
        number2.print();
        System.out.println(number2.getNum());
        number2.changeType("Рабочий");
        number2.print();
    }
}
