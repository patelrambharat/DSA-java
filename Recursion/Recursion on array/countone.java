import java.util.*;

public class Main {
	static int count1(int n) {
        //Write code here
		if(n==0){
			return 0;
		}
		if(n%10==1){
			return 1 + count1(n/10);
		}
		else{
			return count1(n/10);
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count1(n));
        sc.close();
    }
}
