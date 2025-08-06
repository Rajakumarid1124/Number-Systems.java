/*
 * Write a program that takes a number N and prints:
The sum of the first N natural numbers.
The factorial of N.
Input Format

A single integer N
Constraints

1 <= N <= 20

Output Format

First line: Sum of first N natural numbers
Second line: Factorial of N
Sample Input 0

5
Sample Output 0

15
120
Sample Input 1

1
 */


import java.io.*;
import java.util.*;

public class Su {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int sum=0;
        int fact=1;
        for(int i=0;i<=a;i++){
            sum=sum+i;
           // System.out.println(sum);
        }
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
             System.out.println(sum);

             System.out.println(fact);

        
    }
}
