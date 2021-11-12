package com.blp.generic;

public class Maximum{

    public static <E extends Comparable>E findMaximum(E a, E b, E c) {

        E max = a;
        if (a.compareTo(b) > 0 && b.compareTo(c) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
        public static void main (String[]args){
            System.out.println("Welcome to Generics Maximum Program");

        }

}
