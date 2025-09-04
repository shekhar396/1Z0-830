package com.ocp21._01_basics;

/**
 * PrimitivesDemo
 *
 * @author Mia Abdullah Shekhar
 * @since 9/3/2025
 */
public class PrimitivesDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        boolean flag = true;
        char c = 'A';

        // Autoboxing
        Integer boxed = x;
        int unboxed = boxed;

        var z = "Type Inference with var";

        System.out.println("x=" + x + ", y=" + y + ", flag=" + flag + ", c=" + c);
        System.out.println("boxed=" + boxed + ", unboxed=" + unboxed);
        System.out.println(z);
    }
}