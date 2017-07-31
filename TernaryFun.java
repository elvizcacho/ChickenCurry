package com.ternary.chickencurry;


public class TernaryFun {

    public static void main(String[] args) {
        boolean randomBoolean = getRandomBoolean();
        randomBoolean ? eatAKorma() : eatASaag();
    }

    private static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    private void eatAKorma() {
        System.out.println("Eat a chicken korma");
    }

    private void eatASaag() {
        System.out.println("Eat an aloo saag");
    }

}
