// User function template for C++

class isarraysorted {
    public:
      boolean arraySortedOrNot(int arr[], int n) {
          // code here
          for(int i=0;i<n;i++){
          if(arr[i] < arr[i-1]){
              return false;
          }
          }
          return true;
      }
  };