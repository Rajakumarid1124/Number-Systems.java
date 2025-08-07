/*You are given an integer number. Write a program to determine whether the number is:
Positive
Negative
Zero
Input Format

A single integer n
Constraints

-10^5 <= n <= 10^5
Output Format

Print one of the following based on the input:
Positive
Negative
Zero
Sample Input 0

0
Sample Output 0

Zero
Sample Input 1

-1
Sample Output 1

Negative
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0)
        System.out.println("Positive");
        else if(a==0)
         System.out.println("Zero");
        else
          System.out.println("Negative");
  

                        

            
    }
}
