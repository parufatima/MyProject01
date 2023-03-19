package assignment4.inheritance;

public class Iphone14 extends Iphone {  //Multilevel Inheritance Phone, Mobile, Iphone, Iphone14
    public static void main(String[] args) {

        Iphone14.communication();
        Iphone14.addition();
        Iphone14 iphone14 = new Iphone14();
        iphone14.phoneName("iPhone14+");
        iphone14.phoneColor();
        iphone14.sound();
    }
}
