class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>ans  = new ArrayList<Integer>();
               for (int i = 0; i < n - 1; i++) {
              boolean leader = true;
        
              //Checking whether arr[i] is greater than all the elements in its right side
              for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[i]) {
                  leader = false;
                  break;
                }
        
              if (leader)
                ans.add(arr[i]);
            }
            ans.add(arr[n - 1]);
          return ans;
    }
}