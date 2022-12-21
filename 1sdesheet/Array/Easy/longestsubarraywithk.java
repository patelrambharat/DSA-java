public static int lenOfLongSubarr (int A[], int N, int K) {
    //Complete the function
                 int i = 0, j = 0, sum = 0;
            int maxLen = Integer.MIN_VALUE;
         
            while (j < N) {
              sum += A[j];
              if (sum < K) {
                j++;
              }
              else if (sum == K) {
                maxLen = Math.max(maxLen, j-i+1);
                j++;
              }
              else if (sum > K) {
                while (sum > K) {
                  sum -= A[i];
                  i++;
                }
                if(sum == K){
                  maxLen = Math.max(maxLen, j-i+1);
                }
                j++;
              }
            }
            return maxLen;
}