package com.dw.thinkinjava.chapter1.staticdemo;

public class TestStatic {
    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        staticTest1.I = 49;
        StaticTest.I++;
        System.out.println(staticTest1.I);
        System.out.println(staticTest2.I);
        System.out.println(staticTest2.I == staticTest2.I);
        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);
        System.out.println(staticTest2.i == staticTest2.i);
       System.out.println(staticTest1.obj);
        System.out.println(staticTest2.obj);
        System.out.println(staticTest2.obj == staticTest2.obj);
        System.out.println(staticTest2.obj.equals(staticTest2.obj));
    }
}
