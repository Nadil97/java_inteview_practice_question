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
### String Contains Vowels

This Java program determines if a given input string contains vowels. It uses a regular expression to match the string against the set of vowels 
`(a, e, i, o, u)`.
at is dm
## 03 How do you check if a list of integers contains only odd numbers in Java?

The `containsOnlyOddNumbers` method takes a list of integers as input and checks whether each number in the list is odd. If it finds any even number in the list, it returns `false`. If it completes the loop without finding any even numbers, it returns `true`.

The main method creates a list of integers and calls the containsOnlyOddNumbers method to check whether the list contains only odd numbers. The program then prints a message indicating whether the list contains only `odd` numbers or not.

You can add more test cases to the `main` method to check the program's behavior for different input lists.

## 04 How do you check whether a string is a palindrome in Java?

This Java program checks whether a given string is a palindrome. A string is considered a palindrome if it reads the same backward as forward.

To use this program, run the `palindrome` class. The program prompts the user to enter a string as an input to check whether it is a palindrome or not. For example:

`Enter a string as an input to check whether it is palindrome or not`

The program then checks whether the input string is a palindrome or not and prints a message indicating the result. For example:

`racecar is a palindrome string`

## 05 How do you sort an array in Java?

### Sorting Arrays with the Arrays Utility Class
 
The java.util.Arrays class provides many overloaded sort() methods to sort both primitive and object arrays in Java.

### Sorting a Primitive Array

If you want to sort a primitive array in the natural order, you can use the Arrays.sort() method. For example:

`int[] numbers = {1,2,7,3,4}};`
`Arrays.sort(numbers);`

In this example, only the subarray from index 1 (inclusive) to index 4 (exclusive) will be sorted.

## 06. How can you find the factorial of an integer in Java?

The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number
`F(n) = F(1)*F(2)...F(n-1)*F(n)`

## 07. How do you reverse a string in Java?

There is no `reverse()` utility method in the `String` class. However, you can create a character array from the string and then iterate it from the end to the start. You can append the characters to a string builder and finally return the reversed string.

Bonus points for adding `null` check in the method and using `StringBuilder` for appending the characters. Note that the indexing in Java starts from 0, so you need to start at `chars.length - 1` in the `for ` loop.

## 08. Write a Java program to check if the given number is a prime number

The `PrimeNumberCheck` class contains a `main` method that invokes the `isPrime` method, passing in two integers, `19` and `49`. The `isPrime` method takes an integer as its argument and returns a boolean value indicating whether the integer is a prime number or not.

The `isPrime` method first checks whether the input integer is equal to 0 or 1, and if it is, it returns false because these numbers are not considered prime. Next, it checks whether the input integer is equal to 2, which is the only even prime number, and if it is, it returns `true.`

If the input integer is not 0, 1, or 2, the isPrime method enters a loop that iterates from 2 to the integer divided by 2. During each iteration, it checks whether the integer is divisible by the loop variable, and if it is, it returns `false` because the integer is not a prime number. If none of the loop iterations return false, the method returns true, indicating that the input integer is a prime number.

Overall, this code provides a simple and efficient algorithm to determine whether an integer is a prime number or not.

## 09 Write a Java program to print a Fibonacci sequence using recursion

This Java code generates and prints a sequence of numbers called the `Fibonacci sequence`. The PrintFibonacci class has a `printFibonacciSequence` method that takes an integer value count as an input, and uses a `loop` to generate and print the first count numbers of the Fibonacci sequence.

The method initializes three variables `a`, `b`, and `c`to `0`, `1`, and `1` respectively. It then enters a loop that iterates count times, printing the value of a during each iteration, followed by a comma and a space. After printing the current value of a, it updates the values of the three variables to prepare for the next iteration. Specifically, it assigns `b` to `a`, `c` to `b`, and calculates the new value of `c` as the sum of `a` and `b`.

The main method invokes the printFibonacciSequence method with an argument of `10`, which prints the first 10 numbers of the Fibonacci sequence.

Overall, this code provides a simple and efficient way to generate and print the `Fibonacci sequence` in `Java`.












