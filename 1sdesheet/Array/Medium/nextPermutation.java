class Solution {
    static void reverse(int[] arr, int start, int end)
    {
      while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
      }
    }
  
    static void swap(int[] arr, int i, int j)
    {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  
      public void nextPermutation(int[] nums) {
          int i, j;
          int n = nums.length;
          for( i=n-2;i>=0;i--){        //find pivot 
              if(nums[i] < nums[i+1]){
                  break;
              }
  
          }
          if(i<0){   //pivot not found reverse whole array
              reverse(nums, 0 , n - 1);
          }
          else{     //pivot found find successor 
              for( j= n-1;j>=0;j--){
                  if(nums[j] > nums[i]){
                      break;
                  }
              }
              swap(nums, i, j);    //swap pivot and successor 
              reverse(nums, i + 1, nums.length - 1);
          }
          
      }
  }