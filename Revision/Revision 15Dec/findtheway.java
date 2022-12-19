import java.util.*;

public class Main {
    public static int[] findTheWay(int[][] matrix) {
        //Write code here
		int r =0;
		int c=0;
		//1 -> east 2-> south , 3-> west , 4 -> north
		int dir =1;
		while(true){
			if(matrix[r][c] == 1){
				//turn 90 degree right
				dir++;
				if(dir ==5){
					dir = 1;
				}
				//convert 1-> 0 to avoid cycle
				matrix[r][c] =0;
			}
			if(dir ==1){
				//going east
				c++;
			}
			else if(dir ==2){
				//going south
				r++;
			}
			else if(dir ==3){
				//going west 
				c--;
			}
			else {
				//going north
				
				r--;
			}
			//exited or not
			if(r<0){
				//top exit
					return new int[]{r+1,c};
			}
			else if(c == matrix[0] .length){
				//right exit
				return new int[]{r, c-1};
			}
			else if(r == matrix.length){
				//bottom exit
				return new int[]{r-1, c};
			}
			else if(c < 0){
				return new int[]{r, c+1};
			}
		}
		
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		}
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}