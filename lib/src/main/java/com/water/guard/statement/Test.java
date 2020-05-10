package com.water.guard.statement;

public class Test {

    void func() {
        if (getConditonA()) {
            //do nothing or return
        } else {
            if (getConditonB()) {
                //do nothing or return
            } else {
                doConditionB();
            }
        }
    }

    private void doConditionB() {
    }

    private boolean getConditonB() {
        return true;
    }

    private boolean getConditonA() {
        return true;
    }
}
