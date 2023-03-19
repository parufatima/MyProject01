package assignment6.generic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListClass {
    public static void main(String[] args) {

        List<String> student = new ArrayList<>();
        //Add items
        student.add("Amreen");
        student.add("Fahmida");
        student.add("kamal");
        student.add("Aysha");
        student.add("Safwan");

        System.out.println(student);
        //Access an Item  OR search an item
        System.out.println("print last student name :" +student.get(4));

        //Change an Item /update
        student.set(1,"Mim");
        System.out.println(student);

        //size
        System.out.println("Size of the student :"+ student.size());

        //Add duplicate value
         student.add("Amreen");
        System.out.println(student);

        //Remove an item
        student.remove(5);
        System.out.println(student);

    //for-each loop
        for (String name:student)
        {
            System.out.println(name);
        }
        System.out.println("=====================================");

        //sort an ArrayList
        Collections.sort(student);
        for (String name:student)
        {
            System.out.println(name);
        }
        // Clear an ArrayList
        student.clear();
        System.out.println(student);
    }
}
