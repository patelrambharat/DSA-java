import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNumber {
		//final is something that can'nt be updated
    public static String largestNumber(final int[] A) {
        // your code here
		String[] arr = new String[A.length];
		for(int i=0;i<A.length;i++){
			arr[i] = A[i] +"";
		}
		//using lambda function for sorting the array 
		// A lambda expression is a short block of code which takes 
		// in parameters and returns a value. Lambda expressions are similar
		// to methods, but they do not need a name and they ca
		// 	n be implemented right in the body of a method.
		// (parameter1, parameter2) -> { code block }
		Arrays.sort(arr, (a,b) ->{
			Long n1 = Long.parseLong(a+b);
			Long n2 = Long.parseLong(b +a);
			if(n1 > n2){
				return -1;
			}
			if(n2 > n1){
				return 1;
			}
			else{
				return 0;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i= arr.length -1;i>=0;i--){
			sb.insert(0, arr[i]);
		}
		
		return sb.toString();
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(largestNumber(arr));
	}
}