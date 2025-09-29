package com.ocp21._01_basics.q;

/**
 * Q_Strings
 *
 * @author Mia Abdullah Shekhar
 * @since 9/29/2025
 * Practice & demo questions for Java Strings and Text Blocks (OCP/Interview).
 * Each static method shows a small, focused example you can run individually.
 */
public class Q_Strings {

    public static void main(String[] args) {
        poolVsNew();
        equalityCheck();
        concatExamples();
        commonMethods();
        stringBuilderDemo();
        textBlockDemo();
        nullConcat();
        trickyReplace();
    }

    // 1. String pool vs new
    static void poolVsNew() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("pool vs new:");
        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        System.out.println("s1 == s3 : " + (s1 == s3)); // false
        System.out.println();
    }

    // 2. == vs equals
    static void equalityCheck() {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println("Equality check:");
        System.out.println("a == b : " + (a == b));          // true
        System.out.println("a.equals(b): " + a.equals(b));   // true
        System.out.println("a == c : " + (a == c));          // false
        System.out.println("a.equals(c): " + a.equals(c));   // true
        System.out.println();
    }

    // 3. Concatenation
    static void concatExamples() {
        String x = "Hi";
        String y = "Hi";
        String z = x + y;
        String w = "HiHi";
        String v = "Hi" + "Hi";
        System.out.println("Concatenation:");
        System.out.println("z == w : " + (z == w)); // false, runtime concat
        System.out.println("v == w : " + (v == w)); // true, compile-time concat
        System.out.println();
    }

    // 4. Common methods
    static void commonMethods() {
        String s = "  Java OCP  ";
        System.out.println("Common methods:");
        System.out.println("trim().length(): " + s.trim().length()); // 8
        System.out.println("substring(2,6): " + s.substring(2,6));    // "va O"
        System.out.println("indexOf('a',3): " + s.indexOf('a', 3));
        System.out.println();
    }

    // 5. StringBuilder demo
    static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" there");
        System.out.println("StringBuilder demo:");
        System.out.println(sb); // Hi there
        System.out.println();
    }

    // 6. Text block demo (Java 15+)
    static void textBlockDemo() {
        String json = """
                {
                  "name": "Shekhar",
                  "role": "Dev"
                }
                """;
        System.out.println("Text block demo:");
        System.out.println(json);
        System.out.println();
    }

    // 7. null concatenation
    static void nullConcat() {
        String s = null;
        System.out.println("Null concat:");
        System.out.println("Value: " + s); // Value: null
        System.out.println();
    }

    // 8. replace example
    static void trickyReplace() {
        System.out.println("Replace example:");
        System.out.println("abc".replace('a', 'b')); // bbc
        System.out.println();
    }
}
