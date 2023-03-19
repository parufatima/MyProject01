package assignment4.inheritance;

public class FixedPhone extends Phone{ //Hierarchy with Mobile and FixedPhone
    public static void main(String[] args) {
        FixedPhone fixedPhone = new FixedPhone();
        fixedPhone.phoneName("T&T");
        fixedPhone.phoneColor();
        FixedPhone.communication();
        FixedPhone.addition();
        System.out.println(fixedPhone.weight);
    }
}
