package lesson5;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.print();
        tree.grow();
        tree.print();

        Bush bush = new Bush();
        bush.print();
        bush.grow();
        bush.print();

        Plant[] plants = new Plant[]{tree, bush};

        for (Plant plant:plants) {
            plant.grow();
            plant.print();
        }

        PhoneNumber number1 = new PhoneNumber("Домашний", 55925);
        PhoneNumber number2 = new PhoneNumber("Мобильный", 55925);
        PhoneNumber number3 = new PhoneNumber("Мобильный", 33528);

        System.out.println(number1.equals(number2));
        System.out.println(number1.equals(number3));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());


    }
}
