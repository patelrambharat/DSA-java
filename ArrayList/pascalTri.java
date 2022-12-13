package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTri {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
        // write code here
		ArrayList<ArrayList<Integer>>pT = new ArrayList(n);
		for(int i=0;i<n;i++){
			pT.add(new ArrayList(i+1));    //kyoki 0 ke liye 1 hai yha pe
 		}
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j ==0 || j==i){
					pT.get(i).add(1);
				}
				else{
					int getAbove = pT.get(i-1) .get(j);
					int getdia = pT.get(i-1) .get(j-1);
					pT.get(i).add(getAbove + getdia);
				}
			}
		}
		return pT;
    }
}
