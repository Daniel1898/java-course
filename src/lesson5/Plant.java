package lesson5;

public abstract class Plant {
    double height;
    double width;

    public Plant() {
    }

    public Plant(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public abstract void grow();

    public void print(){
        System.out.println("height" + height + " width:" + width);
    }
}
