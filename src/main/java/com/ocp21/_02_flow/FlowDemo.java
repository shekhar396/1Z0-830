package com.ocp21._02_flow;

/**
 * FlowDemo
 *
 * @author Mia Abdullah Shekhar
 * @since 9/29/2025
 * Demonstrates Java flow-control constructs:
 * if/else, switch (classic & enhanced), loops,
 * break/continue (with labels), and pattern matching.
 */
public class FlowDemo {

    public static void main(String[] args) {
        basicIfElse(5);
        switchClassic("apple");
        switchExpression(3);
        loopExamples();
        labeledBreakExample();
        patternMatchingInstanceof("Hello OCP");
    }

    // 1. if/else example
    static void basicIfElse(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        System.out.println();
    }

    // 2. Classic switch with String
    static void switchClassic(String fruit) {
        switch (fruit) {
            case "apple":
                System.out.println("Red or green");
                break;
            case "banana":
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Unknown fruit");
        }
        System.out.println();
    }

    // 3. Enhanced switch expression (Java 14+)
    static void switchExpression(int day) {
        String type = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day");
        };
        System.out.println("Day type: " + type);
        System.out.println();
    }

    // 4. Loops: for, while, do-while, for-each
    static void loopExamples() {
        System.out.println("For loop:");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 3) {
            System.out.print(j++ + " ");
        }
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.print(k++ + " ");
        } while (k < 3);
        System.out.println("\nEnhanced for loop:");
        for (String s : new String[]{"A", "B", "C"}) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }

    // 5. Labeled break
    static void labeledBreakExample() {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && i == 1) {
                    break outer; // exits both loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println();
    }

    // 6. Pattern matching with instanceof (Java 16+)
    static void patternMatchingInstanceof(Object obj) {
        if (obj instanceof String s && s.length() > 5) {
            System.out.println("Long string: " + s);
        } else {
            System.out.println("Not a long string or not a string");
        }
        System.out.println();
    }
}
