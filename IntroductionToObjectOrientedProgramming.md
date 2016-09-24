# Introduction to Object Oriented Programming

1.** What is method overloading in OOP?**
*Method overloading is defining methods with same name but different signature (arguments types and/or count)*
2. What is method overriding in OOP? 
*Method overriding is overriding method implementation (behavior) of superclass in subclass.*
3. What is method hiding?
*Method hiding is defining new method that hides method of superclass. This concept is related with visibility scope.*
4. Is Java a pure object oriented language? If not why?
*Java isn’t pure object oriented language because of a primitive types. But all primitive types have object wrappers.*
5. What are rules of method overloading and overriding?
  * *For method overloading programmer need to change a method signature (argument types/count/order (must be different types))
  * For method overriding programmer need to inherit a new class from existing superclass and define there new implementation of already existing method with @Override annotation.  
  * Overriding method can’t throw checked exception which is higher in hierarchy, than checked exception thrown by overridden method.
  * Overriding method can’t reduce access for overridden method.*
6. The difference between method overloading and overriding?
*Method overloading is defining methods with same name but different implementation based on arguments in same class and method overriding is defining a new method implementation in subclasses.*
7. Can we overload a static method?
*Yes, static method can be overloaded.*
8. Can we override static method?
*No, static method can’t be overloaded because it belongs to class and not to objects.*
9. Can we prevent overriding a method without using the final modifier?
*Yes, we can use private and static modifiers.*
10. Can we override a private method?
*No, we can’t override a private method. We can’t even see it in subclasses.*
11. What is covariant method overriding?
*Covariant method overriding is defining new method in subclass with return type that is more narrower than return type in superclass. (subclass of parent method return type)*
12. Can we change the return type of method to subclass while overriding?
*Yes, we can do it. But new return type must be a subclass of old return type. (See “covariant method overriding”)*
13. Can we change the argument list of an overriding method?
14. Can we override a method which throws runtime exception without throws clause?
15. How do you call superclass version of an overriding method in sub class?
16. Can we override a non-static method as static?
17. Can we override the final method?
18. Can we have a non-abstract method inside interface?
19. What is the default method of Java 8?
20. What is an abstract class?
21. What is an interface? What is the real user of an interface?
22. The difference between Abstract class and interface?
23. Graphically represent a Vehicle class and three Vehicle objects named car1, car2, and car3.
24. Graphically represent a Person class with the following components: 
  * Instance variables name, age, and gender.
  * Instance methods setName, getName, and getAge.
  * Class method getAverageAge.
25. Design a DVD class where a DVD object represents a single music DVD. What kinds of information (artist, genre, total playing time, etc.) do you want to know about a DVD? Among the information in which you are interested, which are instance variables? Are there any class variables or class constants?
26. Suppose the Vehicle class in Exercise 23 is used in a program that keeps track of vehicle registration for the Department of Motor Vehicles. What kinds of instance variables would you deﬁne for such Vehicle objects? Can you think of any useful class variables for the Vehicle class? 
27. Suppose the following formulas are used to compute the annual vehicle registration fee for the vehicle registration program of Exercise 26:
  * For cars, the annual fee is 2 percent of the value of the car.
  * For trucks, the annual fee is 5 percent of the loading capacity (in pounds) of the truck. 
Deﬁne two new classes Car and Truck as subclasses of Vehicle. 
Hint: Associate class and instance variables common to both Car and Truck to Vehicle.
28. Consider a student registration program used by the registrar’s ofﬁce. The program keeps track of students who are registered for a given semester. For each student registered, the program maintains the student’s name, address, and phone number; the number of classes in which the student is enrolled; and the student’s total credit hours. 
The program also keeps track of the total number of registered students. 
Deﬁne instance and class variables of a Student class that is suitable for this program.
29. Suppose the minimum number and maximum number of courses for which a student can register are different depending on whether the student is a graduate, undergraduate, or work/study student. Redo Exercise 28 by deﬁning classes for different types of students. Relate the classes, using inheritance. 
30. Imagine you are given the task of designing an airline reservation system that keeps track of ﬂights for a commuter airline. List the classes you think would be necessary for designing such a system. Describe the data values and methods you would associate with each class you identify.  
Note: For this exercise and Exercises 31 through 34, we are not expecting you to design the system in complete detail. The objective of these exercises is to give you a taste of thinking about a program at a very high level. Try to identify about a half dozen or so classes, and for each class, describe several methods and data members. 
31. Repeat Exercise 30, designing a university course scheduling system. The system keeps track of classes offered in a given quarter, the number of sections offered, and the number of students enrolled in each section. 
32. Repeat Exercise 30, designing the state Department of Motor Vehicles registration system. The system keeps track of all licensed vehicles and drivers. How would you design objects representing different types of vehicles (e.g., motorcycles and trucks) and drivers (e.g., class A for commercial licenses and class B for towing vehicles)?
33. Repeat Exercise 30, designing a sales tracking system for a fast-food restaurant. The system keeps track of all menu items offered by the restaurant and the number of daily sales per menu item. 
34. When you write a term paper, you have to consult many references: books, journal articles, newspaper articles, and so forth. Repeat Exercise 30, designing a bibliography organizer that keeps track of all references you used in writing a term paper. 
35. Consider a program that maintains an address book. Design an inheritance hierarchy for the classes such as Person, Professional Contact, Friend, and Student that can be used in implementing such a program. 
36. Do you think the design phase is more important than the coding phase? Why or why not?
37. How does the quality of design affect the total cost of developing and maintaining software?
