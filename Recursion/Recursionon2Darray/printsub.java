import java.util.*;
import java.util.Scanner;

public class Main{
    static void printSubsequence(String s) {
        //Write your code here
		f(s,"",0);
    }
	static void f(String ques,String asf, int idx)
	{
		if(idx==ques.length()){
			System.out.print(asf + " ");
			return;
		}
		char c = ques.charAt(idx);
		f(ques,asf+c,idx+1);
		f(ques,asf,idx+1);
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}