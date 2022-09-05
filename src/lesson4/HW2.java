package lesson4;

public class HW2 {
    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber();
        number.numType = "Рабочий";
        number.num = 34582;

        System.out.println("Номер:" + number.num + ", тип: " + number.numType);
    }
}
