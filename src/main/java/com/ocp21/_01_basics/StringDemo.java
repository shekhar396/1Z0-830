package com.ocp21._01_basics;

/**
 * StringDemo
 *
 * @author Mia Abdullah Shekhar
 * @since 9/8/2025
 */

public class StringDemo {
    public static void main(String[] args) {
        // -------------------------
        // 1. String literals vs new String()
        // -------------------------
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (String pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (new object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (value comparison)

        // -------------------------
        // 2. Immutability and concatenation
        // -------------------------
        String s4 = "Java";
        s4.concat(" Rocks"); // does not change s4
        System.out.println("s4 after concat(): " + s4); // Java
        s4 = s4 + " Rocks"; // new string assigned
        System.out.println("s4 after +: " + s4); // Java Rocks

        // -------------------------
        // 3. Compile-time vs runtime concatenation
        // -------------------------
        String a = "Hello";
        String b = "World";
        String c = "HelloWorld";
        String d = a + b; // runtime concatenation
        String e = "Hello" + "World"; // compile-time
        System.out.println("c == d: " + (c == d)); // false (runtime creates new object)
        System.out.println("c == e: " + (c == e)); // true (compile-time optimized)

        // -------------------------
        // 4. String methods
        // -------------------------
        String text = "OCP Exam 21";
        System.out.println(text.length()); // 11
        System.out.println(text.charAt(4)); // E
        System.out.println(text.indexOf("Exam")); // 4
        System.out.println(text.substring(4, 8)); // Exam
        System.out.println(text.contains("21")); // true
        System.out.println(text.startsWith("OCP")); // true
        System.out.println(text.endsWith("21")); // true
        System.out.println(text.replace("21", "22")); // OCP Exam 22

        // -------------------------
        // 5. StringBuilder vs StringBuffer
        // -------------------------
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Builder");
        System.out.println("StringBuilder: " + sb); // Hello Builder

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Buffer");
        System.out.println("StringBuffer: " + sbf); // Hello Buffer

        // -------------------------
        // 6. Equals vs ==
        // -------------------------
        String s5 = "Test";
        String s6 = "Test";
        String s7 = new String("Test");
        System.out.println(s5 == s6); // true (pooled)
        System.out.println(s5 == s7); // false (new object)
        System.out.println(s5.equals(s7)); // true (value equality)

        // -------------------------
        // 7. Text blocks (Java 13+)
        // -------------------------
        String textBlock = """
                This is a
                multi-line text
                block in Java.
                """;
        System.out.println(textBlock);
    }
}
