package com.chen.dayaction.designpattern.strategy1;


import static com.chen.dayaction.designpattern.strategy1.calculator.Calculator.*;

/**
 * 策略枚举案例：实现输入两个数字与加减操作符获得计算结果。
 * 它是一个浓缩了的策略模式的枚举。
 * 策略枚举是一个非常优秀和方便的模式， 但是它受枚举类型的限制，
 * 每个枚举项都是public、 final、 static的， 扩展性受到了一定的约束，
 * 因此在系统开发中， 策略枚举一般担当不经常发生变化的角色
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        int a = 100 ,b = 30;
        String symbol ="+";
        if(args.length== 3){
            a = Integer.valueOf(args[0]);
            symbol = args[1];
            b = Integer.valueOf(args[2]);
        }

        switch (symbol){
            case "+":
                System.out.println(a+symbol+b+"="+ADD.exec(a,b));
                break;
            case "-":
                System.out.println(a+symbol+b+"="+SUB.exec(a,b));
        }
    }
}
