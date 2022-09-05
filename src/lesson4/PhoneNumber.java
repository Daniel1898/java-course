package lesson4;

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
}
