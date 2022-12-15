package StringBufferandbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BR {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //another way to take input and that one is BufferReader
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        //read integer --> input integer using buffered reader
        // int a = Integer.parseInt(br.readLine());  //String
        // System.out.println(a);

        // long b = Long.parseLong(br.readLine());
        // System.out.println(b);
        
        //character using buffered reader 
        String str= br.readLine();
        System.out.println(str);

        //character using br
        char ch = (char)(br.read());
        System.out.println(ch);
    }
}
