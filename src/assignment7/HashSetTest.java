package assignment7;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> color= new HashSet<>();
        //Add items in HashSet
        color.add("Red");
        color.add("White");
        color.add("Blue");
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Pink");

        System.out.println(color);

        //Check If an Item Exists
        color.contains("Blue");
        System.out.println(color.contains("Blue"));

        //Size of a HashSet
        System.out.println(color.size());

        //Remove an item
        color.remove("Black");
        System.out.println(color.size());

    // for-each loop
        for(String i : color){
            System.out.println(i);
        }
    }
}
