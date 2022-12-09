import java.util.*;
public class unionandintersection {

    public static void unionandin(int arr1[] , int arr2[] , int n , int m ){
        String union = "";
        String intersection = "";
       
        int i=0; int j=0;
        while(i < n && j < m) {
        if(arr1[i] == arr2[j]){
        union += arr1[i] + " ";
        intersection += arr1[i] + " ";
       
        i++; j++;
        }
        else if(arr1[i] < arr2[j]){
        union += arr1[i] + " ";
        i++;
        }
        else{
        union += arr2[j] + " ";
        j++;
        }
        }
       while(i < arr1.length){
        union += arr1[i];
        }
       
       while(j < arr2.length) {
        union += arr2[j];
        }
       
        System.out.println("union :"+union);
        System.out.println("intersection :"+intersection);
       }
       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr1[i] =sc.nextInt();
        }
        int m =sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        unionandin(arr1, arr2 , n, m);
    }
}

