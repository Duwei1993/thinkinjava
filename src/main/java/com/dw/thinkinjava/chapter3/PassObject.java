package com.dw.thinkinjava.chapter3;

import com.sun.istack.internal.NotNull;

class Letter{
    char c;
}

public class PassObject {
    static void f(@NotNull Letter y){
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c = " + x.c);
        f(x);
        System.out.println("1: x.c = " + x.c);
    }
}
