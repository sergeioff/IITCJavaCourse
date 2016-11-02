Will the following method compile? If not, why?
```
public static void print(List<? extends Number> list) {
    for (Number n : list)
        System.out.print(n + " ");
    System.out.println();
}
```

__Answer:__

Yes, this code will compile.