package com.ocp21._01_basics.q;

/**
 * Q_Operators
 *
 * @author Mia Abdullah Shekhar
 * @since 9/4/2025
 */
public class Q_Operators {
    public static void main(String[] args) {
        System.out.println("This is a wrapper class for running operators questions.");
    }
}

/**
 * OCP-style tricky questions on Operators.
 * Each class has a main method to test independently.
 */
class Q1_Unary {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a + a++ + --a;
        // Step by step:
        // ++a = 6
        // a++ = 6 (then a=7)
        // --a = 6
        // total = 18
        System.out.println(b); // 18
    }
}

class Q2_IntegerDivision {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        double z = x / y;
        // int / int = int → 3, then assigned to double → 3.0
        System.out.println(z); // 3.0
    }
}

class Q3_ModulusNegative {
    public static void main(String[] args) {
        System.out.println(-7 % 3); // -1
        System.out.println(7 % -3); // 1
    }
}

class Q4_ShortCircuit {
    public static void main(String[] args) {
        int a = 0;
        boolean b = false && (a++ > 0); // short-circuit, (a++ > 0) not evaluated
        System.out.println("a = " + a); // 0
        System.out.println("b = " + b); // false
    }
}

class Q5_BitwiseVsLogical {
    public static void main(String[] args) {
        int a = 0;
        boolean b = false & (a++ > 0); // non-short-circuit, evaluates RHS
        System.out.println("a = " + a); // 1
        System.out.println("b = " + b); // false
    }
}

class Q6_TernaryPromotion {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        // result promoted to double
        var result = (a > 5) ? a : b;
        System.out.println(result); // 10.0
    }
}

class Q7_AssignmentCasting {
    public static void main(String[] args) {
        byte b = 10;
        // b = b + 1; // Compile error (int → byte)
        b += 1; // Works (implicit cast)
        System.out.println(b); // 11
    }
}

class Q8_Precedence {
    public static void main(String[] args) {
        int result = 10 + 20 * 2 / 5;
        // Multiplication/division first → 20*2=40, 40/5=8, then add 10
        System.out.println(result); // 18
    }
}

class Q9_Associativity {
    public static void main(String[] args) {
        int res = 100 / 10 / 2;
        // Left to right → (100/10)=10, (10/2)=5
        System.out.println(res); // 5
    }
}

class Q10_EqualityWrappers {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true (cached)

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false (outside cache)
    }
}
