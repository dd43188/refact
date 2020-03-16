package com.water.ifelse.before;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println(Arrays.toString(args) + "=" + cal.exec(a, symbol, b));
    }
}
