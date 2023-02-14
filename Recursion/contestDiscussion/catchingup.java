import java.util.*;

class Solution {

    int catchingUp(int a, int b) {
       // write code here
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		if(a==0){
			return b;
		}
		// a<=b guaranteed
		if(b%a==0)
		{
            return a;
		}
		return catchingUp(b%a,a);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.catchingUp(a,b));

    }
}
