package assignment6.nonGeneric;

public class NonGenericTest {
    public static void main(String[] args) {
        IntegerClass integerClass =new IntegerClass(25);
        LongClass longClass = new LongClass(55669922);
        DoubleClass doubleClass = new DoubleClass(595.99);
        StringClass stringClass = new StringClass("Aysha");

        System.out.println(integerClass.getAge());
        System.out.println(longClass.getAccount());
        System.out.println(doubleClass.getPrice());
        System.out.println(stringClass.getName());
    }
}
