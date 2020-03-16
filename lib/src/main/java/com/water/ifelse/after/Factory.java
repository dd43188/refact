package com.water.ifelse.after;

import com.water.ifelse.after.internal.Add;
import com.water.ifelse.after.internal.Calculator;
import com.water.ifelse.after.internal.Div;
import com.water.ifelse.after.internal.Mul;
import com.water.ifelse.after.internal.Sub;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private final static String ADD = "+";
    private final static String SUB = "-";
    private final static String MUL = "*";
    private final static String DIV = "/";

    private static Factory factory = null;

    private Map<String, Class> classMap = new HashMap<>();

    static {
        factory = new Factory();
    }

    private Factory() {
        initClass();
    }

    public static Factory getInstance() {
        return factory;
    }

    private void initClass() {
        classMap.put(ADD, Add.class);
        classMap.put(DIV, Div.class);
        classMap.put(SUB, Sub.class);
        classMap.put(MUL, Mul.class);
    }

    public Calculator getCaculator(String symbol) {
        if (classMap.containsKey(symbol)) {
            Class cl = classMap.get(symbol);
            try {
                Object object = cl.newInstance();
                return (Calculator) object;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    /**
     * for android
     */
//    public List<String > getClassList(String packageName){
//        List<String >classNameList=new ArrayList<String >();
//        try {
//
//            DexFile df = new DexFile(this.getPackageCodePath());//通过DexFile查找当前的APK中可执行文件
//            getClass().get
//            Enumeration<String> enumeration = df.entries();//获取df中的元素  这里包含了所有可执行的类名 该类名包含了包名+类名的方式
//            while (enumeration.hasMoreElements()) {//遍历
//                String className = (String) enumeration.nextElement();
//
//                if (className.contains(packageName)) {//在当前所有可执行的类里面查找包含有该包名的所有类
//                    classNameList.add(className);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return  classNameList;
//    }
}
