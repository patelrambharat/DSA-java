package Recursion.contestDiscussion;
import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s=sc.nextLine();

        Solution obj=new Solution();
        System.out.println(obj.solve(s));
        sc.close();
    }
}
class Solution{
    public String solve(String s)
    {
        // your code here
		/*if(s.length()==1)
		{
			return s;
		}
		return solve(s.substring(1)) + s.charAt(0);
        */
		char []arr = s.toCharArray();
		f(0,arr.length-1,arr);
		String t = new String(arr);
		return t;
    }
	public void f(int start, int end, char []arr)
	{
		//[start.....end]
		if(start>end){
			return;
		}
// start<=end
char temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
f(start+1,end-1,arr);
}
}
