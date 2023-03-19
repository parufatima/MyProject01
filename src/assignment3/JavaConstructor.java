package assignment3;

public class JavaConstructor {

    public String name;
    public String model;

    public JavaConstructor(){

    }

    public JavaConstructor(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void talk(){
        System.out.println("Tom is using "+ name +" "+ model);
    }
    public  static void watch(){
        System.out.println("You can watch video in your phone ");

    }

    public static void main(String[] args) {

        JavaConstructor phone = new JavaConstructor();
        phone.name="iPhone";
        phone.model="14Pro";
        phone.talk();

        JavaConstructor phone1 = new JavaConstructor();
        phone1.name="Samsung Galaxy";
        phone1.model="A54 5G";
        phone1.talk();

        JavaConstructor phone2 =new JavaConstructor("iPhone", "13mini");
        phone2.talk();
        JavaConstructor.watch();
    }

}
