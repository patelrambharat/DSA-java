class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Arrays.sort(arr);
	   int longest = 1;
	   int curr = 1;
	   for(int i=1;i<N;i++){
	       if(arr[i] != arr[i-1]){
	           if(arr[i] == arr[i-1] +1){
	               curr++;
	           }
	           else{
	               longest  = Math.max(longest, curr);
	               curr =1;
	           }
	       }
	   }
	   return Math.max(longest, curr);
	}
}




//optimal approach
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : nums){      //sbko hasset me enter kiya 
            hs.add(num);
        }
        int longeststreak = 0;
        for(int num : nums){

            if(!hs.contains(num -1)){    //check usse ek km exist krta hai kya
                int currnum = num;

                int currstr = 1;
                while(hs.contains(currnum +1)){    //agr ek jyada exist krta hai to 
                    currnum +=1;
                    System.out.println("currnum "+currnum);
                    currstr +=1;
                    System.out.println("currstr "+currstr);
                }
                longeststreak = Math.max(longeststreak, currstr);
                System.out.println("longest check " + longeststreak);
            }
        }
        return longeststreak;
    }
}