import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }
   public static void permutationPrint(String ques, String asf)
    {
        // your code here	if(ques.length()==0){
			System.out.println(asf);
			return;
		}
		// ques = "bcxy"
		for(int i=0;i<ques.length();i++)
		{
			char c = ques.charAt(i);
			String left= ques.substring(0,i);
			String right = ques.substring(i+1);
			permutationPrint(left+right,asf+c);
		}
    }
  }
