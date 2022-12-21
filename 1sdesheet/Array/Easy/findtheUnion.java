

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
             TreeSet <Integer> s=new TreeSet<>();  //Treeset is used for sorted 
              ArrayList < Integer > Union=new ArrayList<>();
              for (int i = 0; i < n; i++)
                s.add(arr1[i]);
              for (int i = 0; i < m; i++)
                s.add(arr2[i]);
              for (int it: s)
                Union.add(it);
                
              return Union;
    }
}

//better approach



//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
                public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
                {
                    // add your code here
                     int i = 0, j = 0; // pointers
              ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
              while (i < n && j < m) {
                if (arr1[i] <= arr2[j]) // Case 1 and 2
                {
                  if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                  i++;
                } else // case 3
                {
                  if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                  j++;
                }
              }
              while (i < n) // IF any element left in arr1
              {
                if (Union.get(Union.size()-1) != arr1[i])
                  Union.add(arr1[i]);
                i++;
              }
              while (j < m) // If any elements left in arr2
              {
                if (Union.get(Union.size()-1) != arr2[j])
                  Union.add(arr2[j]);
                j++;
              }
              return Union;
    }
}

