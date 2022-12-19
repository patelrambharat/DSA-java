import java.util.*;

public class Main {
    public static int[] floorAndCeil(int key, int[] arr) {
        //Write code here
		int floor = -1;
		int ceil = -1;
		int si = 0;
		int ei = arr.length -1;
		while(si <=ei){
			int mid = (si  + ei )/2;
			if(arr[mid] == key){
				return new int[]{key , key};
			}
			else if(arr[mid] > key){
				ceil = arr[mid];
				ei = mid -1;
			}
			else {
				floor = arr[mid];
				si = mid +1;
			}
			
		}
		return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = floorAndCeil(key, arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}