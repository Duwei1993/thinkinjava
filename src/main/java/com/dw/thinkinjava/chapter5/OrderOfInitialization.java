package com.dw.thinkinjava.chapter5;

class Window{
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}

class House{
    //Before constructor
    Window w1 = new Window(1);
    House(){
        //show that we are in constructor
        System.out.println("House()");
        w3 = new Window(33);
    }
    //After constructor
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    //At end
    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
