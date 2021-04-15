package com.dw.thinkinjava.chapter3;

class Tank{
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 9;
        tank2.level = 47;
        System.out.println("1: tank1.levle = " + tank1.level);
        System.out.println("   tank2.levle = " + tank2.level);
        tank1 = tank2;
        System.out.println("2: tank1.levle = " + tank1.level);
        System.out.println("   tank2.levle = " + tank2.level);
        tank1.level = 27;
        System.out.println("3: tank1.levle = " + tank1.level);
        System.out.println("   tank2.levle = " + tank2.level);

    }
}
