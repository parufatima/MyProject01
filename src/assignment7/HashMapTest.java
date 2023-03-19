package assignment7;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {

        List<String>sqaClass = new ArrayList<>();
        sqaClass.add("Class");
        sqaClass.add("Interface");
        sqaClass.add("AbstractClass");

        Map<String,Object> learning = new HashMap<>();
        learning.put("java",true);
        learning.put("selenium",false);
        learning.put("appium",true);

        Map<String, Object>stringobjectMap = new HashMap<>();
        stringobjectMap.put("name","Jhon");
        stringobjectMap.put("age",22);
        stringobjectMap.put("learning",learning);
        stringobjectMap.put("sqaClass",sqaClass);

        System.out.println(stringobjectMap);
    }
}
