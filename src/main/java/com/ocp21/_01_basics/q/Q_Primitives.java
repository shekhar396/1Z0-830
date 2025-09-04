package com.ocp21._01_basics.q;

/**
 * Q_Primitives
 *
 * @author Mia Abdullah Shekhar
 * @since 9/3/2025
 */

public class Q_Primitives {
    public static void main(String[] args) {
        System.out.println("This is a wrapper class for running primitives questions.");

        System.out.println("Running Q1_Autoboxing: ");
        Q1_Autoboxing.main(args);

        System.out.println();

        System.out.println("Running Q2_TypeCasting: ");
        Q2_TypeCasting.main(args);

        System.out.println();
        System.out.println("Running Q3_Overflow: ");
        Q3_Overflow.main(args);

        System.out.println();
        System.out.println("Running Q4_VarDemo: ");
        Q4_VarDemo.main(args);

        System.out.println();
        System.out.println("Running Q5_Operators: ");
        Q5_Operators.main(args);

        System.out.println();
        System.out.println("Running Q6_Boolean: ");
        Q6_Boolean.main(args);

        System.out.println();
        System.out.println("Running Q7_FloatPrecision: ");
        Q7_FloatPrecision.main(args);


    }
}


/**
 * Q1: What is the output?
 */
class Q1_Autoboxing {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true or false?

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // true or false?

        Integer n = null;
//         int m = n;  // Uncomment: what happens?
    }
}

/**
 * Q2: Type Casting
 */
class Q2_TypeCasting {
    public static void main(String[] args) {
        int i = 10;
        double d = i;      // implicit casting
        System.out.println(d);

        double x = 5.7;
        int y = (int)x;    // explicit casting
        System.out.println(y);

        // char to int
        char c = 'A';
        int n = c;
        System.out.println(n);
    }
}

/**
 * Q3: Overflow and Underflow
 */
class Q3_Overflow {
    public static void main(String[] args) {
        byte b = -128;
        b --; // overflow
        byte x = 1;
        System.out.println("byte overflow: " + b);

        byte c = 127;
        c++; // overflow
        System.out.println("byte overflow: " + c);

        int max = Integer.MAX_VALUE;
        System.out.println(max + 1); // integer overflow
    }
}

/**
 * Q4: Var type inference
 */
class Q4_VarDemo {
    public static void main(String[] args) {
        var a = 10;       // int
        var b = 10.5;     // double
        var c = "OCP";    // String
        System.out.println(a + " " + b + " " + c);

        // var x;         // ❌ Error: cannot infer type
        // var y = null;  // ❌ Error: cannot infer type
    }
}

/**
 * Q5: Operators on primitives
 */
class Q5_Operators {
    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));

        // relational
        System.out.println(a > b); // true
        System.out.println(a <= b); // false

        // logical
        System.out.println(a>0 && b>0); // true
        System.out.println(a>0 || b<0); // true

        // bitwise
        System.out.println(a & b); // 0
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 7

        // ternary
        int max = (a > b) ? a : b;
        System.out.println("max=" + max);
    }
}

/**
 * Q6: Boolean expressions
 */
class Q6_Boolean {
    public static void main(String[] args) {
        boolean flag = true;
        boolean test = false;
        System.out.println(flag && test); // false
        System.out.println(flag || test); // true
        System.out.println(!flag);        // false
    }
}

/**
 * Q7: Floating point precision
 */
class Q7_FloatPrecision {
    public static void main(String[] args) {
        float f = 1.0f / 3;
        double d = 1.0 / 3;
        System.out.println(f);
        System.out.println(d);

        // Comparing floats/doubles
        System.out.println(f == d); // ❌ usually false due to precision
    }
}
