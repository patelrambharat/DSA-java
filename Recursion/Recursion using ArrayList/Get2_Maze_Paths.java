import java.io.*;
import java.util.*;

public class Main {
      public static void gmp(int sr,int sc,int dr,int dc,ArrayList<String>ans, String asf)
    {
        if(sr==dr && sc==dc){
            ans.add(asf);
            return;
        }
        if(sr>dr || sc>dc){
            return;
        }
        gmp(sr,sc+1,dr,dc,ans,asf+"h1");
        gmp(sr,sc+2,dr,dc,ans,asf+"h2");
        gmp(sr+1,sc,dr,dc,ans,asf+"v1");
        gmp(sr+2,sc,dr,dc,ans,asf+"v2");
        gmp(sr+1,sc+1,dr,dc,ans,asf+"d1");
        gmp(sr+2,sc+2,dr,dc,ans,asf+"d2");
       
    }
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        // write code here
        ArrayList<String>ans = new ArrayList<>();
        gmp(0,0,n-1,m-1,ans,"");
        return ans;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
