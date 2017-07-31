package com.ternary.chickencurry;


public class TernaryFun {

    public static void main(String[] args) {
        boolean randomBoolean = getRandomBoolean();
        
        e((randomBoolean) ? eatAKorma() : eatASaag());
    }
    
    private static void e(String a) {}

    private static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    private static String eatAKorma() {
        System.out.println("Eat a chicken korma");
        return "Eat a chicken korma";
    }

    private static String eatASaag() {
        System.out.println("Eat an aloo saag");
        return "Eat an aloo saag";
    }

}
