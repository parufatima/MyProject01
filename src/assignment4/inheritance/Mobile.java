package assignment4.inheritance;

public class Mobile extends Phone{  //Single inheritance
    public static void main(String[] args) {
        Mobile mobile = new Mobile ();
        mobile.phoneName("All mobile phone");
        mobile.phoneColor();
        Mobile.communication();
        Mobile.addition();

    }
}
