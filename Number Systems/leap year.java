/*An extra day is added to the calendar almost every four years as February 29, and the day is called a leap day. It corrects the calendar for the fact that our planet takes approximately 365.25 days to orbit the sun. A leap year contains a leap day.
In the Gregorian calendar, three conditions are used to identify leap years:
The year can be evenly divided by 4, is a leap year, unless:
The year can be evenly divided by 100, it is NOT a leap year, unless:
The year is also evenly divisible by 400. Then it is a leap year.
This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years. Source
Task
Given a year, determine whether it is a leap year.
Input Format

Read , the year to test.
Constraints

1 <= year <= 10000
Output Format

Print Leap Year if the year is a leap year
Otherwise, print Not a Leap Year
Sample Input 0

2020
Sample Output 0

Leap Year
Sample Input 1

1900
Sample Output 1

Not a Leap Year
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0)
            System.out.println("Leap Year");
        else if(a%100!=0 && a%4==0)
             System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");


    }
}
