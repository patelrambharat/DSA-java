// <!-- Count digits in a number
// Problem Statement: Given an integer N , write program to count number of digits in N.

// Examples:

// Example 1:
// Input: N = 12345
// Output: 5
// Explanation: N has 5 digits

// Example 2:
// Input: N = 8394
// Output: 4
// Explanation: N has 4 digits -->

//Approach 1:
// Store the integer in a variable X and initialize a counter variable to count the number of digits.
// We know that in programming languages when we divide X by Y it will result in an integer (given both the variables are integers). For example, 133/10 will result in 13 similarly 1/10 will result in 0.
// Using a for loop and above observation keep on dividing X by 10 and increment the count in every iteration when X equals 0 terminate the loop and the count will have the number of digits in N.
import java.util.*;
import java.lang.*;
import java.io.*;

public class Basic1
{
        public static int count(long n){
                if(n==0){
                        return 1;
                }
                int count =0;
                while(n!=0){
                        n= n/10;
                        count++;
                }
                return count;
        }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc  = new Scanner(System.in);
                long  n= sc.nextLong();
                System.out.println(count(n));
	}
}


Time Complexity: O (n) where n is the number of digits in the given integer

Space Complexity: O(1)


Solution 2 : 
Convert the integer into a string.
Find the length of the string      

static int count_digits(int n


Time Complexity: O (1) 

Space Complexity: O(1)) {
        String n2 = Integer.toString(n);
        return n2.length();
      }

Time Complexity: O (1) 

Space Complexity: O(1)