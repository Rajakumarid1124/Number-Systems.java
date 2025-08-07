/*Write a program to print numbers from 1 to N in normal order and then in reverse order, all in the same line, separated by a space.
Input Format

A single integer N
Constraints

1 <= N <= 1000
Output Format

First, print numbers from 1 to N, separated by a space
Then, print numbers from N to 1, separated by a space
All in a single line, with a single space between each number.
Sample Input 0

5
Sample Output 0

1 2 3 4 5 5 4 3 2 1
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        for(int i=1;i<=a;i++)
            System.out.print(i+" ");
        for(int j=a;j>=1;j--)
            System.out.print(j+" ");
    }
}
