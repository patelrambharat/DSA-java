import java.util.*;

public class Main {
    public static boolean SearchA2DMatrix(int[][] mat, int x) {
        //Write your code here
            // Return true or false
		int n = mat.length;
		int m = mat[0].length;
		int si = 0;
		int ei = n-1;
		int ridx =-1;
		while(si<=ei){
			int mid = (si + ei)/2;
			if(mat[mid][m-1] == x){
				return true;
			}
			else if(mat[mid][m-1] > x){
				ridx =mid;
				ei = mid -1;
				
			}
			else{
				si = mid+1;
			}
		}
		if(ridx == -1){
			return false;
		}
		si  =0;
		ei = m-1;
		while(si <= ei){
			int mid = (si + ei)/2;
			if(mat[ridx][mid]  ==x){
				return true;
			}
			else if(mat[ridx][mid] >x){
				ei = mid -1;
			}
			else{
				si = mid+1;
			}
		}
		return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}