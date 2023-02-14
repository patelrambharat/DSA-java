import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, n));
    }

	public static int recforMin(int[] arr, int n) {
        //Write your code here
		// It will tell min in array from pos 1 to pos n
		if(n==1)
		{
			return arr[0];
		}
		// 1..........n-1
		int a = recforMin(arr,n-1);
		return Math.min(a,arr[n-1]);
    }
}