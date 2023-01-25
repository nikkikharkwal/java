/*
Description

You are given seven numbers, stored in the variable with the following names

a,b,c,d,e,f,g
You have to declare two variables,sum1andsum2, such thatsum1 = (a + b) * candsum2 = (d + e + f + g)

Print the output of the following operation

sum1 > sum2

Input
The first and the only line of input contains the seven numbers stored in the variable with the namesa,b,c,d,e,f,g


Output
Print the output of the operation, given in the problem statement

Sample Input 1 

1 2 3 4 5 6 7
Sample Output 1

false
Hint

In the sample test case, the value stored in the variables is as follows

a = 1,b = 2,c = 3,d = 4,e = 5,f = 6,g = 7

The value of sum1, as explained in the problem statement will be,sum1 = (a + b) * c = (1 + 2) * 3 = (3) * 3 = 9

Similarly, the value of sum2, as explained in the problem statement will besum2 = (d + e + f + g) = (4 + 5 + 6 + 7) = 22

The operationsum1 > sum2will print false, as the value of sum2 is greater than sum1, hence the output false.
  */

public static void compareSevenNumbers(int a,int b,int c,int d,int e,int f,int g){
    //write your code here
    int sum1 = (a + b) * c;
    int sum2 = (d + e + f + g);
    System.out.println(sum1 > sum2);
  }