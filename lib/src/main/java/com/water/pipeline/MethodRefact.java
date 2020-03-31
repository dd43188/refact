package com.water.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
}