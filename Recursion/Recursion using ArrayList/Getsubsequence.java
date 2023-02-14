import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> generateSubsequences(String str)
    {
        // write your code here  
		if(str.length() ==0){
			ArrayList<String>bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String>rres = generateSubsequences(ros);
		ArrayList<String>mres = new ArrayList<>();
		for(String rstr : rres){
			mres.add(ch + rstr);
		}
		for(String rstr : rres){
			mres.add(rstr);
		}
		Collections.sort(mres);
		return mres;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}