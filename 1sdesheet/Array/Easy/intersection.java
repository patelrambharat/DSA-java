ArrayList<Integer> ans=new ArrayList<>();
  int visited[]=new int[B.length]; // to maintain visited 
  int i = 0, j = 0;
  for (i = 0; i < A.length; i++) {
    for (j = 0; j < B.length; j++) {

      if (A[i] == B[j] && visited[j] == 0) { 
     //if element matches and has not been matched with any other before
        ans.add(B[j]);
        visited[j] = 1;

        break;
      } else if (B[j] > A[i]) break; 
       //because array is sorted , element will not be beyond this
    }
  }
  System.out.print("The elements are: ");
  for (i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }
}
}

//better Approach
ArrayList<Integer> ans=new ArrayList<>();

int i = 0, j = 0; // to traverse the arrays

while (i < A.length && j < B.length) {
  if (A[i] < B[j]) { //if current element in i is smaller
    i++;
  } else if (B[j] < A[i]) {
    j++;
  } else {
    ans.add(A[i]); //both elements are equal
    i++;
    j++;
  }
}