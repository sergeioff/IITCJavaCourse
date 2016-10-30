For Exercises 1 to 3, the following three data structures are used:
* One-dimensional array of double of size 365. 
* Two-dimensional array of double with 12 rows. Each row has 28, 30, or 31 columns. 
* An array of Month objects with each Month object having an array of double of size 28, 30, or 31.

Discuss the pros and cons of each approach. 

__Answer:__

* If we use a one-dimensional array to represent our data it's more convenient to manipulate with this data structure as
with year, but we need use an offset variable to manipulate with months.
* If we use a two-dimensional array to represent our data, this data structure is more comfortable then one-dimensional
array because we have better access to months and we don't need an offset variable.
* Using an array of Month objects is the most comfortable way to represent our data. By using this representation we have
all advantages of OOP programming.