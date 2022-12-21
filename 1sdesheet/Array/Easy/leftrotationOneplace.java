static void solve(int arr[], int n) {
    int temp[]=new int[n];
    for (int i = 1; i < n; i++) {
      temp[i - 1] = arr[i];
    }
    temp[n - 1] = arr[0];
    for (int i = 0; i < n; i++) {
      System.out.print(temp[i]+" ");
    
    }

// Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(n) as we are using another array of size, same as the given array.