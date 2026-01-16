class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int h = m*n-1; 
        while(l<=h){
            int mid = l + ((h-l)/2);
            int r = mid/n;
            int c = mid%n;
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]>target)h = mid - 1;
            else l = mid + 1;
        }
        return false;


        // for(int i = 0;i<m;i++){
        //     if(matrix[i][0]<=target && target<=matrix[i][n-1]){
        //       return bs(matrix[i],target);
        //     }
        // }
        // return false;
    }
    // public boolean bs(int arr[],int t){
    //     int low = 0;
    //     int high = arr.length-1;
    //     while(low<=high){
    //         int mid = low + ((high-low)/2);
    //         if(arr[mid]==t)return true;
    //         else if(arr[mid]>t) high = mid- 1;
    //         else low = mid + 1;
    //     }
    //     return false;
    // }
}