import java.util.*;
import static java.lang.Math.ceil;

public class Main {

	public static int fib(int n ){
        // write code here
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		/*int x = fib(n-1);
		int y = fib(n-2);
		return x+y;*/
		return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}


