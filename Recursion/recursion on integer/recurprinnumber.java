import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
		printtillN(N, 1);
    }

	public static void printtillN(int N, int i) {
		// i......N
		if(i==N){
			System.out.print(i + " ");
			return;
		}
		System.out.print(i + " ");
		printtillN(N,i+1);
    }
}
