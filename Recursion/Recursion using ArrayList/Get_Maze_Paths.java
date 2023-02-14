import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       // your code here
		 if(sr== dr && sc == dc){
		            ArrayList<String>bres = new ArrayList<>();
		            bres.add("");
		            return bres;
		        }
		        ArrayList<String>hpaths = new ArrayList<>();
		        ArrayList<String>vpaths = new ArrayList<>();
		        if(sc < dc){
		            hpaths=  getMazePaths(sr, sc +1, dr , dc);
		        }
		        if(sr < dr){
		           vpaths=  getMazePaths(sr +1, sc, dr, dc);
		        }
		        ArrayList<String>paths = new ArrayList<>();
		        for(String hpath : hpaths){
		            paths.add("h" +hpath);
		        }
		        for(String vpath : vpaths){
		            paths.add("v"+vpath);
		        }
		        
		        return paths;
		    }
		}


                        
                        
                        
                        
                        
                                

                        
                                