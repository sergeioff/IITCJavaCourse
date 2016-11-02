Will the following class compile? If not, why?
```
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}
```

__Answer:__

No this class will not compile, because we can't compare _x_ and _y_ of type T.
To fix this code we need rewrite this code as:
```
public final class Algorithm {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x > y ? x : y;
    }
}
```