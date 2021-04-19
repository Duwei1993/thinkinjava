package com.dw.thinkinjava.chapter5;

class Banana{
    public void peel(int i){
        System.out.println(this);
    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana banana1 = new Banana(), banana2 = new Banana();
        banana1.peel(1);
        banana2.peel(2);
        //staticf(this);
        staticf(new BananaPeel());
    }

    public void f(){
        System.out.println("not a static method");
    }

    public static void staticf(BananaPeel bananaPeel){
        System.out.println("static method");
        bananaPeel.f();
    }
}
