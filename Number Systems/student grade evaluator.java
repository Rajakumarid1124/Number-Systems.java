/*Given the marks of a student out of 100, determine the grade based on the following criteria:
90 to 100 → Grade A
80 to 89 → Grade B
70 to 79 → Grade C
60 to 69 → Grade D
50 to 59 → Grade E
< 50 → Fail
Input Format

A single integer marks (out of 100)
Constraints

0 <= marks <= 100
Output Format

Print the grade as one of the following:
Grade A, Grade B, Grade C, Grade D, Grade E, or Fail
Sample Input 0

95
Sample Output 0

Grade A
Sample Input 1

34
Sample Output 1

  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>=90 &a<=100)
            System.out.println("Grade A");
        else if(a>=80&&a<=89)
            System.out.println("Grade B");
        else if(a>=70&&a<=79)
            System.out.println("Grade C");
        else if(a>60&&a<=69)
            System.out.println("Grade D");
        else if(a>=50 && a<=59)
            System.out.println("Grade E");
        else
            System.out.println("Fail");
            

    }
}
Fail
