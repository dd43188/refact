package com.water.ifelse.before;

public class Calculator {
    private final static String ADD = "+";
    private final static String SUB = "-";
    private final static String MUL = "*";
    private final static String DIV = "/";

    public int exec(int a,String symbol,int b){
        int result = 0;
        switch (symbol){
            case ADD:
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case MUL:
                result = a * b;
                break;
            case DIV:
                result = a / b;
                break;
            default:
                result = -1;
        }
        return result;
    }
}