/*You are given a single character. Your task is to determine and print whether the character is:
an uppercase alphabet
a lowercase alphabet
a digit
a special character
Input Format

A single character ch
Constraints

Input is a single valid printable ASCII character
Output Format

Print one of the following messages based on the type of character:
"Uppercase Alphabet"
"Lowercase Alphabet"
"Digit"
"Special Character"
Sample Input 0

A
Sample Output 0

Uppercase Alphabet
Sample Input 1

5
Sample Output 1
  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        char a =sc.next().charAt(0);
        if(a>='A' && a<='Z')
            System.out.println("Uppercase Alphabet");
        else if(a>='a' && a<='z')
           System.out.println("Lowercase Alphabet");
        else if(a>='0' && a<='9')
            System.out.println("Digit");
        else
         System.out.println("Special Character");

            



    }
}

  

Digit
