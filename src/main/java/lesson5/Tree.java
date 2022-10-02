package lesson5;

public class Tree extends Plant{
    @Override
    public void grow() {
        height += 0.9;
    }

    @Override
    public void print() {
        System.out.println("Plant: Tree. Height: " + height + " width: " + width);
    }
}
