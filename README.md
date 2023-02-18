# java_inteview_practice_question
## 01. How do you swap two numbers without using a third variable in Java?

`a= 5` 
`b = 10` 

We want to swap the values of a and b so that a becomes 10 and b becomes 5.

The first line, **b = b + a** adds the values of a and b together and assigns the result to b. In our example, this would make b equal to 15 (10 + 5).

The second line,  **a = b - a** subtracts the original value of a from the new value of b, effectively swapping a and b. In our example, this would make a equal to **5 (15 - 10)**.

The third line, **b = b - a** , subtracts the new value of a (which was originally b) from the new value of b, effectively swapping a and b again. In our example, this would make b equal to **10 (15 - 5)** 

After these three lines of code have executed, a will be equal to 10 and b will be equal to 5, which is the desired result.

The comment in the code, // now b is sum of both the numbers, is not strictly accurate, as b is not necessarily the sum of both numbers after the first line of code has executed. It would be more accurate to say that b is now the result of adding a to its original value.

The comments in the code are helpful for understanding what each line of code does, and they provide some insight into the programmer's thought process. In a README.md file, comments like these can be used to explain how the code works and to provide context for readers who may be unfamiliar with the codebase.


## 02 Write a Java program to check if a vowel is present in a string
##  String Contains Vowels

This Java program determines if a given input string contains vowels. It uses a regular expression to match the string against the set of vowels 
`(a, e, i, o, u)`.

## How do you check if a list of integers contains only odd numbers in Java?

The `containsOnlyOddNumbers` method takes a list of integers as input and checks whether each number in the list is odd. If it finds any even number in the list, it returns `false`. If it completes the loop without finding any even numbers, it returns `true`.

The main method creates a list of integers and calls the containsOnlyOddNumbers method to check whether the list contains only odd numbers. The program then prints a message indicating whether the list contains only `odd` numbers or not.

You can add more test cases to the `main` method to check the program's behavior for different input lists.





