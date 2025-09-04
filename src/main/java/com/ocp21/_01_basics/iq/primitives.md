# Java Interview Questions – Primitives

## 1. How many primitive types are in Java?
- 8 → `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`

---

## 2. What are the default values of primitives?
- `byte`, `short`, `int`, `long` → `0`
- `float`, `double` → `0.0`
- `char` → `'\u0000'`
- `boolean` → `false`
- ⚠️ Local variables **must** be initialized before use

---

## 3. What is the size and range of each primitive type?

| Type    | Bits | Range                                    |
|---------|------|------------------------------------------|
| byte    | 8    | -128 to 127                              |
| short   | 16   | -32,768 to 32,767                        |
| int     | 32   | -2,147,483,648 to 2,147,483,647          |
| long    | 64   | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float   | 32   | ~±3.4e38 (7 decimal digits precision)    |
| double  | 64   | ~±1.7e308 (15 decimal digits precision)  |
| char    | 16   | Unicode 0 to 65,535                      |
| boolean | JVM-dependent (conceptually 1 bit, stored as 1 byte) |

---

## 4. What is numeric promotion in Java?
- `byte`, `short`, `char` → promoted to `int` in arithmetic
- If one operand is `long` → result is `long`
- If one operand is `float` → result is `float`
- If one operand is `double` → result is `double`

---

## 5. Why do we need wrapper classes for primitives?
- To use primitives in collections/generics
- Provides utility methods (`Integer.parseInt()`, `Double.valueOf()`)
- Enables autoboxing/unboxing

---

## 6. What is autoboxing/unboxing?
- **Autoboxing**: Primitive → Wrapper
  ```java
  Integer i = 10; // int → Integer
---

## 7. What happens on overflow?
- Integer types wrap around silently (two’s complement)
  ```java
  byte b = 127;
  b++; // -128
- Floating point overflow → Infinity
---

## 8. Difference between char and String?

- char: 16-bit Unicode primitive (1 character)

- String: Object, immutable sequence of characters

## 9. What is the size of boolean in Java?

- Conceptually: 1 bit (true/false)

- JVM stores as 1 byte (implementation dependent)

## 10. Primitive vs Reference types

- Primitives: Store actual values

- Reference: Store memory addresses (pointing to objects)

- Primitives are not objects (except via wrappers)