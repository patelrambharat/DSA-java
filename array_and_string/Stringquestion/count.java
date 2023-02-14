import java.util.*;

public class count {                  
    //   Java Program To Count Occurrences Of Each Character in a String

        //     There are many solutions to count the occurrence of each character some of them are:

        // Using Naive Approach
        // Using Counter Array
        // Using Java HashMap

        // Javatpoint. In the given string, the frequency of the letter 
        // j is 1 a is 2, v is 1, t- is 2, p is 1, o is 1, i is 1, and n is 1. 

        public static void main(String[] args) {
        String inputString = "Programming";
        HashMap<Character, Integer> mp   = new HashMap<Character, Integer>();
 
        // Converting given string to char array
 
       
 
        // checking each char of strArray
        for (char c : inputString.toCharArray()) {
            if (mp.containsKey(c)) {
 
                // If char is present in charCountMap,
                // incrementing it's count by 1
                mp.put(c, mp.get(c) + 1);
            }
            else {
 
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                mp.put(c, 1);
            }
        }
 
        // Printing the charCountMap
            System.out.println(mp);
       }
}
