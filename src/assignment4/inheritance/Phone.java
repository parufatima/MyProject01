package assignment4.inheritance;

public class Phone {
     static int number1 = 70;
   static  int number2 = 90;
 static String color = "White";
 public String weight = "heavy";
    public static void  communication(){
        System.out.println("We use phone for communication purpose.");
    }
    public static void addition(){
        System.out.println("We can do addition by using phone : number1+number2 = " +( number1+number2));
    }
    public void phoneName(String name){
        System.out.println("The name of the phone is :" + name);
    }
    public void phoneColor(){
        System.out.println("The color of the phone is :" + color);
    }
}
