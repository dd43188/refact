package com.water.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefact {

    public static void main(String[] args) {
        String input = "office, country, telephone \n" +
                "Chicago, USA, +1 312 373 1000 \n" +
                "Beijing, China, +86 4008 900 505 \n" +
                "Bangalore, India, +91 80 4064 9570 \n" +
                "Porto Alegre, Brazil, +55 51 3079 3550 \n" +
                "Chennai, India, +91 44 660 44766";
        System.out.println(acquireData(input));
    }

    public static List<String> acquireData(String input) {
        String[] lines = input.split("\n");
        boolean firstLine = true;
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            if (line.trim() == "")
                continue;
            String[] record = line.split(",");
            if ("India".equals(record[1].trim())) {
                result.add("city:" + record[0].trim());
            }
        }
        return result;
    }

    public static List<String> acquireDataPipe(String input) {
        String[] lines = input.split("\n");
        return Arrays.stream(lines).skip(1)
                .filter((line) -> line.trim() != "")
                .map((line) -> line.split(","))
                .filter((fileds) -> "India".equals(fileds[1].trim()))
                .map((fileds) -> "city:" + fileds[0].trim())
                .collect(Collectors.toList());
    }

    public void test(Map<String, String> map) {
        List<Person> list = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
                .map(e -> new Person(e.getKey(), e.getValue())).collect(Collectors.toList());
    }

    public class Person {
        public Person(String id, String name) {

        }
    }


    public static void unmodify() {
        long time1 = System.currentTimeMillis();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("jiamiaohe");
        }
        long time2 = System.currentTimeMillis();
        List<String> unmodify = Collections.unmodifiableList(list);
        System.out.println("cost = " + (time2 - time1) + ", cost2 = " + (System.currentTimeMillis() - time2));

    }

    public class ClassA {

        //other method

        int c;
        int d;
        int e;
        int f;

        public void doSomething(int a, int b) {
            //DO
        }
    }
}