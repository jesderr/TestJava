package com.company1;

import java.util.*;

public class TestingMap {
    public static void main(String[] args) {
        HashMap<Integer,String> passportAndNames = new HashMap<>();
        passportAndNames.put(1,"a");
        passportAndNames.put(2,"b");
        passportAndNames.put(3,"c");
        passportAndNames.put(4,"d");

        System.out.println(passportAndNames);
        
//        Set<Integer> keys = passportAndNames.keySet();
//        System.out.println("Keys : " + keys);
//
//
//        ArrayList<String> values = new ArrayList<>(passportAndNames.values());
//        System.out.println("Values : " + values);


        for (Map.Entry<Integer,String> entry : passportAndNames.entrySet()) {
            if(entry.getKey().equals(5)){
                System.out.println("Key = 1");
            }else {
                System.out.println("Key != 5");
            }
        }

        Iterator<Map.Entry<Integer,String>> iterator = passportAndNames.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }

    }
}
