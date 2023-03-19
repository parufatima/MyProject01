package assignment6.generic;

import assignment6.interfac.Read;
import assignment6.interfac.Readable;

public class GenericClassTest {
    public static void main(String[] args) {

        GenericClass<Integer> genericClass = new GenericClass<>(5678);
        System.out.println(genericClass.getObject());

        GenericClass<String>stringGenericClass = new GenericClass<>("Selenium");
        System.out.println(stringGenericClass.getObject());

        GenericClass<Double> doubleGenericClass = new GenericClass<>(45.50);
        System.out.println(doubleGenericClass.getObject());

      /*  GenericClass<Read>readGenericClass= new GenericClass<>(new Read());
         System.out.println(readGenericClass.getObject());*/


    }
}
