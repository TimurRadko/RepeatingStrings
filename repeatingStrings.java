package com.timurradko.repeatingStrings;

import java.util.HashMap;
import java.util.Map;

public class repeatingStrings {
    public static void main(String[] args) {
        String[] array = {"W", "W", "L", "L", "P", "J", "U", "Y", "R", "E", "P", "Y"};
        Map<String, Integer> collection = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String arrayString = array[i];
            for (int j = 0; j < array.length - 1; j++) {
                if (arrayString.equals(array[j])) {
                    count++;
                }
            }

            collection.put(array[i], count);
            count = 0;
        }
        for (Map.Entry<String, Integer> pair : collection.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
