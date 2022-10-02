package lesson5;

public class Bush extends Plant{
    @Override
    public void grow() {
        width += 0.05;
    }

    @Override
    public void print() {
        System.out.println("Plant: Bush. Height: " + height + " width: " + width);
    }
}
