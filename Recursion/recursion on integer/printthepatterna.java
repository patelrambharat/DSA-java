import java.io.*;
import java.util.*;

class Main
{

	public static void solve(int n)
    {
        // Your code here
		if(n==0){
			return;
		}
		solve(n-1);
		// pattern of size n-1 has been printed and cursor is at line number n
		/*for(int i=0;i<n;i++){
			System.out.print("* ");
		}*/
		f(n);
		System.out.println();
    }
    
	public static void f(int n)
	{
		if(n==0){
			return;
		}
		System.out.print("* ");
		f(n-1);
	}

	
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}