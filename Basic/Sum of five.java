/*
Description

You are given five numbers stored in variables with the following names

one, two, three, four, five
Find the sum of the five values, and print it


Input
The first and the only line of the input contains five values, stored in the variablesone, two, three, four, five


Output
Print the sum of the five values stored in the variablesone, two, three, four, five


Sample Input 1 

1 2 3 4 5
Sample Output 1

15
Hint

In the sample test case, the values stored in the variables areone = 1, two = 2, three = 3, four = 4, five= 5

The sum of the values is1 + 2 + 3 + 4 + 5 = 15, which is the required sum.
  */

public static void sumOfFive(int one,int two,int three,int four,int five){
        //write your code here
        int sum;
        sum = one + two + three + four + five;
        System.out.println(sum);
    }