__Task:__
Complete the following constructor.
```
class Student { 
private String  name; 
private int age; 
private Address address;
public Student(String name, int age, Address address){
//assign passed values to the data members
}
```

__Answer:__

```
class Student {
  private String name;
  private int age;
  private Address address;
  
  public Student(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}