package com.timurradko.repeatingStrings;

import java.util.HashMap;
import java.util.Map;

public class RepeatingStrings2 {
    public static void main(String[] args) {
        String[] array = {"W", "W", "L", "L", "P", "J", "U", "Y", "R", "E", "P", "Y"};
        Map<String, Integer> collection = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            collection.put(s,count);
               count++;
        }

        for (Map.Entry<String, Integer> pair : collection.entrySet()) {
            String s = pair.getKey();
            int i = pair.getValue();
            System.out.println(s + " : " + i);
        }
    }


}
