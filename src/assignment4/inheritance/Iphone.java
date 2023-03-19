package assignment4.inheritance;

public class Iphone extends Mobile{

    public void sound(){
        System.out.println("Sound quality is very good");
    }
    public static void main(String[] args) {
        Iphone.communication();
        Iphone.addition();
        Iphone iphone = new Iphone();
        iphone.phoneName("iPhoneLatestVersion");
        iphone.phoneColor();
    }
}
