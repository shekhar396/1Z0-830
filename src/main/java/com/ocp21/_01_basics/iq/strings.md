
# Java Strings & Text Blocks – Interview & OCP Questions

## 1. String Pool & Immutability
**Q:** What is the Java String pool?  
**A:** A special memory area inside the JVM Heap where literal strings are stored and reused to save memory.

**Q:** Why are Strings immutable?  
**A:** For security, caching, and thread-safety. Once created, the value cannot be changed; every modification creates a new object.

**Q:** What’s the difference between these?
```java
String s1 = "Hello";
String s2 = new String("Hello");
System.out.println(s1 == s2);
````

**A:** `false` because `s1` points to the pool object, `s2` is a new heap object.

---

## 2. Equality (`==` vs `.equals`)

**Q:** Why can `==` be true sometimes?

```java
String a = "Java";
String b = "Java";
System.out.println(a == b);
```

**A:** `true` because both point to the same pooled instance.

**Q:** Correct way to compare contents?
**A:** Use `equals()`.

---

## 3. Concatenation & Compile-Time Optimization

**Q:** Output?

```java
String x = "Hi";
String y = "Hi";
String z = x + y;
String w = "HiHi";
System.out.println(z == w);
```

**A:** `false` because `x + y` is runtime concatenation (new object).

**Q:** Output?

```java
String a = "Hi" + "Hi";
String b = "HiHi";
System.out.println(a == b);
```

**A:** `true` because `"Hi" + "Hi"` is compile-time and interned.

---

## 4. Common Methods

**Q:** Given:

```java
String s = "  Java OCP  ";
```

* `s.trim().length()` → ?
* `s.substring(2,6)` → ?

**A:** `trim().length()` → 8, `substring(2,6)` → "va O".

**Q:** What is returned by `s.indexOf('a', 3)`?
**A:** Index of the next `'a'` after position 3.

---

## 5. StringBuilder vs StringBuffer

**Q:** Key difference?
**A:** `StringBuilder` is **not** synchronized (faster); `StringBuffer` is synchronized (thread-safe).

**Q:** Output?

```java
StringBuilder sb = new StringBuilder("Hi");
sb.append(" there");
System.out.println(sb);
```

**A:** `Hi there`.

---

## 6. Text Blocks (Java 13+)

**Q:** Create a multi-line string using a text block.
**A:**

```java
String json = """
    {
      "name": "Shekhar",
      "role": "Dev"
    }
    """;
```

**Q:** Are text blocks also immutable?
**A:** Yes, they are still `String` instances.

---

## 7. Miscellaneous Tricky Cases

**Q:** Output?

```java
String s = null;
System.out.println("Value: " + s);
```

**A:** Prints `Value: null` (string concatenation calls `String.valueOf()`).

**Q:** Output?

```java
System.out.println("abc".replace('a','b'));
```

**A:** `bbc`.

---





