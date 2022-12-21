class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxLifes = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int currLevelLifes = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    currLevelLifes++;
                }
            }
            if (currLevelLifes > maxLifes) {
                maxLifes = currLevelLifes;
                index = i;
            }
        }

        return index;
    }
}