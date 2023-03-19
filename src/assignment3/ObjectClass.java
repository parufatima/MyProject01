package assignment3;

public class ObjectClass {
String name ="Amreen";
int age = 9;
 public void play(){
     System.out.println(name +" likes to play");
 }

    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass();
        System.out.println("My name is "+ objectClass.name);
        System.out.println("I am " +objectClass.age + " years old");
        objectClass.play();
    }


}
