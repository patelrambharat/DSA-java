class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Pair pair = new Pair(-1, -1);
        Arrays.sort(arr);
        int floor = -1;
        int ceil = -1;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == x){
                floor =  arr[mid];
                ceil = arr[mid];
                break;
            }
            if(arr[mid] < x){
                floor = arr[mid];
                start = mid +1;
            }
            else if(arr[mid] > x){
                ceil  = arr[mid];
                end = mid -1;
            }
        }
        pair.floor = floor;
        pair.ceil = ceil;
        
        return pair;
    }
}

