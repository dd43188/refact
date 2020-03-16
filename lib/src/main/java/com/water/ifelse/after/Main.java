package com.water.ifelse.after;

import com.water.ifelse.after.internal.Calculator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);

        Calculator cal = Factory.getInstance().getCaculator(symbol);
        if (cal != null) {
            System.out.println(Arrays.toString(args) + "=" + cal.exec(a, b));
        }
    }
}
