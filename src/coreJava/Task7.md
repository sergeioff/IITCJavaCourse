Suppose you want to maintain information on the location where a product is stored in a warehouse. 
Would you use a three-dimensional array such as location[i][j][k], where i is the warehouse number, j is the aisle 
number, and k is the bin number? Or would you deﬁne three classes Warehouse, Aisle, and Bin? 
Describe the alternatives and list their pros and cons.

__Answer:__
I'd rather define three classes. The pros of this approach is better level of program readability. The cons is
declaration of three classes. 

In alternative way we can use a three-dimensional array. The pros of this approach
is that not necessary to declare classes, and some memory saving, because our program operates with primitive types.
The cons is worse readability of program.
