package com.ocp21._01_basics;

/**
 * OperatorDemo
 *
 * @author Mia Abdullah Shekhar
 * @since 9/4/2025
 */

public class OperatorDemo {
    public static void main(String[] args) {
        // 1. Unary Operators
        int a = 5;
        System.out.println("a = " + a);           // 5
        System.out.println("++a = " + (++a));     // 6 (pre-increment)
        System.out.println("a++ = " + (a++));     // 6 (post-increment, then a=7)
        System.out.println("a = " + a);           // 7
        System.out.println("--a = " + (--a));     // 6

        // 2. Arithmetic Operators
        int x = 10, y = 3;
        System.out.println("x + y = " + (x + y)); // 13
        System.out.println("x - y = " + (x - y)); // 7
        System.out.println("x * y = " + (x * y)); // 30
        System.out.println("x / y = " + (x / y)); // 3 (integer division)
        System.out.println("x % y = " + (x % y)); // 1

        // 3. Relational Operators
        System.out.println("x > y: " + (x > y));   // true
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true

        // 4. Logical & Bitwise Operators
        boolean b1 = true, b2 = false;
        System.out.println("b1 && b2: " + (b1 && b2)); // false (short-circuit AND)
        System.out.println("b1 || b2: " + (b1 || b2)); // true  (short-circuit OR)
        System.out.println("b1 & b2: " + (b1 & b2));   // false (non-short-circuit AND)
        System.out.println("b1 | b2: " + (b1 | b2));   // true  (non-short-circuit OR)

        int m = 6, n = 3; // 6 = 110, 3 = 011 in binary
        System.out.println("m & n: " + (m & n)); // 2 (010)
        System.out.println("m | n: " + (m | n)); // 7 (111)
        System.out.println("m ^ n: " + (m ^ n)); // 5 (101)
        System.out.println("~m: " + (~m));       // -7 (bitwise NOT)

        // 5. Ternary Operator
        int num = -10;
        String result = (num >= 0) ? "positive" : "negative";
        System.out.println("num is " + result);

        // 6. Assignment Operators
        int k = 5;
        k += 3; // same as k = k + 3
        System.out.println("k after k += 3: " + k);

        byte b = 10;
        // b = b + 1; // compile error (int → byte)
        b += 1;       // works (implicit cast)
        System.out.println("b after b += 1: " + b);

        // 7. Precedence and Associativity
        int expr = 10 + 20 * 3; // * has higher precedence
        System.out.println("10 + 20 * 3 = " + expr); // 70

        int assoc = 100 / 10 / 2; // left to right
        System.out.println("100 / 10 / 2 = " + assoc); // 5



    }
}
