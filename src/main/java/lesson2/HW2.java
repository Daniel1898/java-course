package lesson2;

/*
Создать массив дробных чисел double длиной 5 с именем doubles
Вывести массив с помощью Arrays.toString()
Заполнить по очереди все элементы с помощью операции получения элемента по индексу
Вывести массив с помощью Arrays.toString()
Изменить первый элемент на 1.00001, последний элемент на -0.189
Вывести массив с помощью Arrays.toString()
 */

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        double[] doubles = new double[5];

        System.out.println(Arrays.toString(doubles));

        doubles[0] = 4.33;
        doubles[1] = 7.63;
        doubles[2] = 8.64;
        doubles[3] = 3.23;
        doubles[4] = 66.5;

        System.out.println(Arrays.toString(doubles));

        doubles[0] = 1.00001;
        doubles[4] = -0.189;

        System.out.println(Arrays.toString(doubles));
    }
}
