import java.util.*;

class Main {
   static ArrayList <String> OldPhone(int n, int[] keys){
		//Write your code here
		String []ref = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TU","VWX","YZ"};
		ArrayList<String> ans = generate(keys,0,ref);
		return ans;
    }

	public static ArrayList<String> generate(int[]keys, int i,String[]ref)
	{
		// return an ArrayList consisting of all interpretations of keys from index i till end
		if(i==keys.length){
			ArrayList<String>ret = new ArrayList<>();
			ret.add("");
			return ret;
		}

		ArrayList<String>res = generate(keys, i+1,ref);
		String inter = ref[keys[i]];
		ArrayList<String>ans = new ArrayList<String>();
		for(int j=0;j<inter.length();j++){
			// inter.charAt(j)
			for(int k=0;k<res.size();k++){
				ans.add(inter.charAt(j)+res.get(k));
			}
		}
		return ans;
	}

	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}