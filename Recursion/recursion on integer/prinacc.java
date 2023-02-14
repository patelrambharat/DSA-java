import java.io.*;
import java.util.*;

class prinacc
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        solve(n);

    }
	//solve(n) is expected to print Acciojob n times
	public static void solve(int n)
    {
        /*
		base case
		If n is 0 this means you need to print 0 times
		so simply return
		*/
		if(n==0)
		{
			return;
		}
		// When you come to line 27 that means its not base case
		// We have to print Acciojob n times
		System.out.println("ACCIOJOB");
		// printed once now I need to print n-1 times more
		// So we call solve(n-1)
		solve(n-1);
		// Once I come here I know that solve(n-1) has worked
		// and printed Acciojob n-1 times and we had printed
		// Acciojob once when we were on line 29
		// Thus Acciojob is printed for n times
		// solve(n) terminates now
    }
}

