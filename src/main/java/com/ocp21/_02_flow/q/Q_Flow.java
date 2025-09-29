package com.ocp21._02_flow.q;

/**
 * Q_Flow
 *
 * @author Mia Abdullah Shekhar
 * @since 9/29/2025
 * Runnable practice questions for Java flow-control constructs:
 * if/else, switch (classic & enhanced), loops, labeled break/continue, pattern matching
 */
public class Q_Flow {

    public static void main(String[] args) {
        basicIfElse();
        switchClassic();
        switchEnhanced();
        loopsDemo();
        labeledBreakContinue();
        patternMatchingInstanceof();
    }

    // 1. if/else
    static void basicIfElse() {
        int x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else if (x == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        System.out.println();
    }

    // 2. Classic switch
    static void switchClassic() {
        String fruit = "banana";
        switch (fruit) {
            case "apple": System.out.println("Red"); break;
            case "banana": System.out.println("Yellow"); break;
            default: System.out.println("Unknown");
        }
        System.out.println();
    }

    // 3. Enhanced switch expression
    static void switchEnhanced() {
        int day = 3;
        String type = switch (day) {
            case 1,7 -> "Weekend";
            case 2,3,4,5,6 -> "Weekday";
            default -> "Invalid";
        };
        System.out.println("Enhanced switch: " + type);
        System.out.println();

        // Example with multiple statements and yield
        int n = 5;
        String parity = switch (n % 2) {
            case 0 -> "Even";
            default -> {
                System.out.println("Calculating...");
                yield "Odd";
            }
        };
        System.out.println("Parity: " + parity);
        System.out.println();
    }

    // 4. Loops: for, while, do-while, enhanced for
    static void loopsDemo() {
        System.out.println("For loop:");
        for (int i=0; i<3; i++) System.out.print(i + " ");
        System.out.println("\nWhile loop:");
        int j=0; while(j<3) System.out.print(j++ + " ");
        System.out.println("\nDo-while loop:");
        int k=0; do System.out.print(k++ + " "); while(k<3);
        System.out.println("\nEnhanced for loop:");
        for(String s : new String[]{"A","B","C"}) System.out.print(s + " ");
        System.out.println("\n");
    }

    // 5. Labeled break/continue
    static void labeledBreakContinue() {
        System.out.println("Labeled break example:");
        outer:
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                if(i==j) break outer;
                System.out.println(i + "," + j);
            }
        }
        System.out.println();

        System.out.println("Labeled continue example:");
        outer2:
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                if(j==1) continue outer2;
                System.out.println(i + "," + j);
            }
        }
        System.out.println();
    }

    // 6. Pattern matching with instanceof
    static void patternMatchingInstanceof() {
        Object obj = "OCP Practice";
        if(obj instanceof String s && s.length()>5) {
            System.out.println("Pattern matching: " + s.toUpperCase());
        } else {
            System.out.println("Not a long string or not a string");
        }
        System.out.println();
    }
}
