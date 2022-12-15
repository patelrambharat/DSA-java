package StringBufferandbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringbui {
    public static void main(String[] args) throws IOException {
        //declare a string builder sb 
        // stirng builder is mutable 
        //new StringBuilder() --> give a empty string builder
        //  StringBuilder sb = new StringBuilder();

        //  //new StringBuilder("bharat") --> convert given string to Stringbuilder
        //  StringBuilder sb2 = new StringBuilder("bharat");
        
        //  //new Stringbuidler(20) -->
        //  StringBuilder sb3 =new StringBuilder(10); 

        // StringBuilder sb =new StringBuilder("I like programming and coffee: ");
        // System.out.println(sb);

        // //insert something at a particular pos
        // sb.insert(18, "gaming");
        // System.out.println(sb);

        // sb.replace(2, 6, "love");
        // System.out.println(sb);

        // sb.delete(7, 20);
        // System.out.println(sb);

        // System.out.println(sb.length());

        // System.out.println(sb.charAt(20));

        // sb.setCharAt(2, 'L');
        // System.out.println(sb);

        // sb.append("and teaching");
        // System.out.println(sb);

        // sb.deleteCharAt(3);
        // System.out.println(sb);

        // sb.insert(3, "o");
        // System.out.println(sb);

        // String str= sb.toString();  //it will become immutable

        // System.out.println(str);

        //tell whether a string is palindrome 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String palinString = br.readLine();

        StringBuilder sbpalin= new StringBuilder(palinString);
        sbpalin.reverse();
        String tempString = sbpalin.toString();
        if(tempString.equals(palinString) == true){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
