# Introduction to Object Oriented Programming

1. __What is method overloading in OOP?__

_Method overloading is defining methods with same name but different signature (arguments types and/or count)_
2. __What is method overriding in OOP?__ 

_Method overriding is overriding method implementation (behavior) of superclass in subclass._
3. __What is method hiding?__

_Method hiding is defining new method that hides method of superclass. This concept is related with visibility scope._
4. __Is Java a pure object oriented language? If not why?__

_Java isn’t pure object oriented language because of a primitive types. But all primitive types have object wrappers._
5. __What are rules of method overloading and overriding?__
  * _For method overloading programmer need to change a method signature (argument types/count/order (must be different types))_
  * _For method overriding programmer need to inherit a new class from existing superclass and define there new implementation of already existing method with @Override annotation._
  * _Overriding method can’t throw checked exception which is higher in hierarchy, than checked exception thrown by overridden method._
  * _Overriding method can’t reduce access for overridden method._
6. __The difference between method overloading and overriding?__

_Method overloading is defining methods with same name but different implementation based on arguments in same class and method overriding is defining a new method implementation in subclasses._
7. __Can we overload a static method?__

_Yes, static method can be overloaded._
8. __Can we override static method?__

_No, static method can’t be overloaded because it belongs to class and not to objects._
9. __Can we prevent overriding a method without using the final modifier?__

_Yes, we can use private and static modifiers._
10. __Can we override a private method?__

_No, we can’t override a private method. We can’t even see it in subclasses._
11. __What is covariant method overriding?__

_Covariant method overriding is defining new method in subclass with return type that is more narrower than return type in superclass. (subclass of parent method return type)_
12. __Can we change the return type of method to subclass while overriding?__

_Yes, we can do it. But new return type must be a subclass of old return type. (See “covariant method overriding”)_
13. __Can we change the argument list of an overriding method?__
14. __Can we override a method which throws runtime exception without throws clause?__
15. __How do you call superclass version of an overriding method in sub class?__
16. __Can we override a non-static method as static?__
17. __Can we override the final method?__
18. __Can we have a non-abstract method inside interface?__
19. __What is the default method of Java 8?__
20. __What is an abstract class?__
21. __What is an interface? What is the real user of an interface?__
22. __The difference between Abstract class and interface?__
23. __Graphically represent a Vehicle class and three Vehicle objects named car1, car2, and car3.__
24. __Graphically represent a Person class with the following components:__ 
  * __Instance variables name, age, and gender.__
  * __Instance methods setName, getName, and getAge.__
  * __Class method getAverageAge.__
25. __Design a DVD class where a DVD object represents a single music DVD. What kinds of information (artist, genre, total playing time, etc.) do you want to know about a DVD? Among the information in which you are interested, which are instance variables? Are there any class variables or class constants?__
26. __Suppose the Vehicle class in Exercise 23 is used in a program that keeps track of vehicle registration for the Department of Motor Vehicles. What kinds of instance variables would you deﬁne for such Vehicle objects? Can you think of any useful class variables for the Vehicle class?__
27. __Suppose the following formulas are used to compute the annual vehicle registration fee for the vehicle registration program of Exercise 26:__
  * __For cars, the annual fee is 2 percent of the value of the car.__
  * __For trucks, the annual fee is 5 percent of the loading capacity (in pounds) of the truck.__ 

__Deﬁne two new classes Car and Truck as subclasses of Vehicle.__ 
__Hint: Associate class and instance variables common to both Car and Truck to Vehicle.__
28. __Consider a student registration program used by the registrar’s ofﬁce. The program keeps track of students who are registered for a given semester. For each student registered, the program maintains the student’s name, address, and phone number; the number of classes in which the student is enrolled; and the student’s total credit hours. 
The program also keeps track of the total number of registered students. 
Deﬁne instance and class variables of a Student class that is suitable for this program.__
29. __Suppose the minimum number and maximum number of courses for which a student can register are different depending on whether the student is a graduate, undergraduate, or work/study student. Redo Exercise 28 by deﬁning classes for different types of students. Relate the classes, using inheritance.__ 
30. __Imagine you are given the task of designing an airline reservation system that keeps track of ﬂights for a commuter airline. List the classes you think would be necessary for designing such a system. Describe the data values and methods you would associate with each class you identify.  
Note: For this exercise and Exercises 31 through 34, we are not expecting you to design the system in complete detail. The objective of these exercises is to give you a taste of thinking about a program at a very high level. Try to identify about a half dozen or so classes, and for each class, describe several methods and data members.__ 
31. __Repeat Exercise 30, designing a university course scheduling system. The system keeps track of classes offered in a given quarter, the number of sections offered, and the number of students enrolled in each section.__ 
32. __Repeat Exercise 30, designing the state Department of Motor Vehicles registration system. The system keeps track of all licensed vehicles and drivers. How would you design objects representing different types of vehicles (e.g., motorcycles and trucks) and drivers (e.g., class A for commercial licenses and class B for towing vehicles)?__
33. __Repeat Exercise 30, designing a sales tracking system for a fast-food restaurant. The system keeps track of all menu items offered by the restaurant and the number of daily sales per menu item.__
34. __When you write a term paper, you have to consult many references: books, journal articles, newspaper articles, and so forth. Repeat Exercise 30, designing a bibliography organizer that keeps track of all references you used in writing a term paper.__
35. __Consider a program that maintains an address book. Design an inheritance hierarchy for the classes such as Person, Professional Contact, Friend, and Student that can be used in implementing such a program.__
36. __Do you think the design phase is more important than the coding phase? Why or why not?__
37. __How does the quality of design affect the total cost of developing and maintaining software?__
