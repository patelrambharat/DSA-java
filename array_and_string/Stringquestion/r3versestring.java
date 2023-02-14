import java.util.*;
import java.io.*;
import java.lang.*;;
public class r3versestring {
    public static void reverseS(String s){
        //     if(str ==null ||str.length() <=1){
        //         return str;
        //     }

        //     //recursive call
        //    return reverseS(str.substring(1)) + str.charAt(0);
                //second condition 
            //     char str[]= s.toCharArray();
            //     int i=0;
            //     int j=str.length-1;
            //     while(i<=j){
            //             char temp= str[i];
            //             str[i] = str[j];
            //             str[j] = temp;
            //             i++;
            //             j--;
            //     }
                
            // for( char ch : str){
            //     System.out.print(ch);
            // }

            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.reverse();
            System.out.print(sb);
    }
        public static void main(String[] args) {
            String str = "hello";
           reverseS(str);
        }
}
