/*
Description

You are given six numbers, stored in variables with the following names

 one, two, three, four, five, six
Print the product of all the six numbers

Input
The first and the only line of the input contains 6 numbers stored in the variablesone, two, three, four, five, six

Constraints

1 <= N <= 20


Output
Print a single integer, denoting the product of the six numbers given.


Sample Input 1 

1 2 3 4 5 6
Sample Output 1

720
Hint

In the sample test case, the value of the variables is as follows

one = 1

two = 2

three = 3

four = 4

five = 5

six = 6

After, multiplying the six numbers, we get the following result1*2*3*4*5*6 = 720, which is the required answer
  */

public static void productOfSix(int one,int two,int three,int four,int five,int six){
    //write your code here
    int product;
    product = one * two * three * four * five * six;
    System.out.println(product);
  }