
# Java Operators & Expressions – Interview & OCP Questions

---

## 1. Unary Operators
**Q:** Difference between `++a` and `a++`?  
**A:**
- `++a` (pre-increment) → increment first, then use the value
- `a++` (post-increment) → use value first, then increment

**Q:** What is the output?
```java
int a = 5;
int b = ++a + a++ + --a;
System.out.println(b);
````

**A:** 18 (step-by-step: ++a=6, a++=6, --a=6 → sum = 6+6+6=18)

**Q:** What is the output of bitwise NOT operator?

```java
int x = 5;
System.out.println(~x);
```

**A:** -6 (flips all bits, two’s complement)

---

## 2. Arithmetic Operators

**Q:** Integer division vs floating-point assignment:

```java
int x = 7;
int y = 2;
double z = x / y;
System.out.println(z);
```

**A:** 3.0 (int / int = int 3, then assigned to double)

**Q:** Modulus with negatives:

```java
System.out.println(-7 % 3);
System.out.println(7 % -3);
```

**A:** -1, 1 (remainder keeps dividend’s sign)

**Q:** Overflow example:

```java
byte b = 127;
b++;
System.out.println(b);
```

**A:** -128 (wrap-around, two’s complement)

---

## 3. Relational & Equality Operators

**Q:** Difference between `==` and `.equals()` for objects?
**A:**

* `==` compares references (memory addresses)
* `.equals()` compares content (can be overridden)

**Q:** Integer caching example:

```java
Integer a = 127, b = 127;
System.out.println(a == b);

Integer x = 128, y = 128;
System.out.println(x == y);
```

**A:** true, false (Integers -128 to 127 are cached)

**Q:** What is the output?

```java
char c1 = 'a', c2 = 'b';
System.out.println(c1 > c2);
```

**A:** false (Unicode value of 'a' = 97, 'b' = 98)

---

## 4. Logical & Bitwise Operators

**Q:** Short-circuit vs non-short-circuit:

```java
int a = 0;
boolean b = false && (a++ > 0);
System.out.println("a=" + a + ", b=" + b);
```

**A:** a=0, b=false (RHS not evaluated)

```java
int a = 0;
boolean b = false & (a++ > 0);
System.out.println("a=" + a + ", b=" + b);
```

**A:** a=1, b=false (RHS evaluated)

**Q:** Bitwise operators example:

```java
int m = 6, n = 3;
System.out.println(m & n);
System.out.println(m | n);
System.out.println(m ^ n);
System.out.println(~m);
```

**A:** 2, 7, 5, -7

**Q:** Difference between logical NOT `!` and bitwise NOT `~`?
**A:**

* `!` → boolean negation (`true` → `false`)
* `~` → flips all bits of integer types

---

## 5. Ternary Operator

**Q:** Type promotion with ternary:

```java
int a = 10;
double b = 20.5;
var result = (a > 5) ? a : b;
System.out.println(result);
```

**A:** 10.0 (promoted to double, the higher precision type)

**Q:** Can ternary operator return different types on each branch?
**A:** No, both branches must be compatible; implicit promotion may occur.

---

## 6. Assignment Operators

**Q:** Why does this fail?

```java
byte b = 10;
b = b + 1;
```

**A:** `b + 1` promoted to int → cannot assign to byte without explicit cast

**Q:** Why does this compile?

```java
byte b = 10;
b += 1;
```

**A:** Compound assignment automatically casts back to byte

**Q:** Example of multiple compound assignments:

```java
int x = 5;
x += 2;  // 7
x *= 3;  // 21
x -= 1;  // 20
System.out.println(x);
```

**A:** 20

---

## 7. Precedence & Associativity

**Q:** Evaluate:

```java
int result = 10 + 20 * 2 / 5;
System.out.println(result);
```

**A:** 18 (\* / / first, left-to-right, then +)

**Q:** Evaluate:

```java
int res = 100 / 10 / 2;
System.out.println(res);
```

**A:** 5 (left-to-right associativity)

**Q:** Which operators have the highest precedence?
**A:** Postfix `++`, `--`, method call `()`, array access `[]`

**Q:** Which operators are right-associative?
**A:** Assignment `=`, `+=`, `-=`, `*=`, `/=`, `%=` and ternary `?:`

---

## 8. Conceptual Questions

1. Which operators cannot be overloaded in Java?

    * All operators except `+` for String concatenation

2. Does Java support operator overloading?

    * No, except `+` for String

3. Difference between bitwise `~` and logical `!`?

    * `~` flips all bits, works on integers
    * `!` negates boolean

4. Difference between `&` and `&&`?

    * `&` → non-short-circuit, always evaluates both sides
    * `&&` → short-circuit, evaluates right side only if needed

5. Difference between `|` and `||`?

    * `|` → non-short-circuit OR
    * `||` → short-circuit OR

---

### ✅ Notes:

* Covers **Unary, Arithmetic, Relational, Logical/Bitwise, Ternary, Assignment, Precedence, Associativity, and Conceptual** questions
* Perfect for **OCP exam prep** and **Java interview revision**

---