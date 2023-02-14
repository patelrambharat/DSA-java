import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr, n));
    }

	public static boolean isPalindrome(int []arr, int n)
	{
		int ans = isPalindromic(arr,0,n-1);
		if(ans==1){
			return true;
		}
		return false;
	}
    public static int isPalindromic(int[] arr, int begin, int end) {
        // Write your code here
            // begin.....end  is a palindrome or not ?
            // 1 -> If yes
            // 0 -> If no
            if(begin>end){
                return 1;
            }
            // begin<=end
            if(arr[begin]!=arr[end])
            {
                return 0;
            }
            return isPalindromic(arr,begin+1,end-1);
        }
    }    