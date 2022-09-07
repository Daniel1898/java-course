package lesson5;

import java.util.Objects;

public class PhoneNumber {
    int num;
    String numType;

    public PhoneNumber(){
        numType = "";
    }

    public PhoneNumber(String type, int number){
        num = number;
        numType = type;
    }

    public void print(){
        System.out.println("Номер:" + num + ", тип: " + numType);
    }

    public void changeType(String newNumType){
        numType = newNumType;
    }

    public int getNum(){
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return num == that.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, numType);
    }
}
