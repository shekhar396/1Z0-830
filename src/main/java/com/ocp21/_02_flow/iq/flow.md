# Java Flow Control – OCP & Interview Questions

## 1. If / Else

**Q:** What is the output?

```java
int x = 5;
if (x > 5)
    System.out.println("A");
else if (x == 5)
    System.out.println("B");
else
    System.out.println("C");
```

**A:** `B` (second branch matches exactly).

---

**Q:** Is this valid?

```java
if (false)
    int a = 10;
```

**A:** ❌ Invalid. A variable declaration without braces needs its own block.

---

## 2. Switch (Classic)

**Q:** What happens?

```java
int day = 2;
switch (day) {
    case 1: System.out.print("Mon");
    case 2: System.out.print("Tue");
    default: System.out.print("Other");
}
```

**A:** `TueOther` – no `break`, so fall-through after case 2.

---

**Q:** Types allowed in a classic `switch` expression?
**A:** `byte`, `short`, `char`, `int`, their wrappers, `String`, and enums.

---

## 3. Enhanced Switch (Java 14+)

**Q:** What does this print?

```java
int num = 2;
String s = switch (num) {
    case 1 -> "One";
    case 2,3 -> "Two or Three";
    default -> { yield "Other"; }
};
System.out.println(s);
```

**A:** `Two or Three`.

---

## 4. Loops

**Q:** Difference between `while` and `do-while`?
**A:** `while` checks condition first; `do-while` executes body **at least once**.

---

**Q:** Output?

```java
for (int i=0; i<3; i++)
    for (int j=0; j<3; j++)
        if (j == 1) break;
System.out.println("Done");
```

**A:** Inner loop stops when `j==1`, outer loop continues; prints `Done` once.

---

## 5. Labels

**Q:** What is a label in Java?
**A:** An identifier + colon placed before a loop or switch to target `break`/`continue`.

---

**Q:** Output?

```java
outer:
for (int i=0; i<2; i++) {
    for (int j=0; j<2; j++) {
        if (i==j) continue outer;
        System.out.println(i + "," + j);
    }
}
```

**A:**

```
0,1
1,0
```

`continue outer` skips directly to the next `i`.

---

**Q:** Difference between `break outer;` and `continue outer;`?
**A:** `break` exits the labeled loop entirely; `continue` jumps to the next iteration of that loop.

---

## 6. Pattern Matching with `instanceof`

**Q:** Explain this code:

```java
Object obj = "hello";
if (obj instanceof String s && s.length() > 3) {
    System.out.println(s.toUpperCase());
}
```

**A:** If `obj` is a `String`, pattern variable `s` is in scope and can be used directly. Prints `HELLO`.

---