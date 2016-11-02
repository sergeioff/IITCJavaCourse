Will the following class compile? If not, why?
```
public class Singleton<T> {

    public static T getInstance() {
        if (instance == null)
            instance = new Singleton<T>();

        return instance;
    }

    private static T instance = null;
}
```

__Answer:__

No, this code will not compile, because we can't use generics in static context.