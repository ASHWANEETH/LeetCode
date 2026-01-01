class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;mid++;
            }
            else if(nums[mid]==1)mid++;
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }




        // int z = 0;
        // int o = 0;
        // int t = 0;
        // for(int x :nums){
        //     switch(x){
        //         case 0 : z++; break;
        //         case 1 : o++; break;
        //         case 2 : t++; break;
        //     }
        // }
        // for(int i = 0;i<z;i++){
        //     nums[i]=0;
        // }
        // for(int i = z;i<z+o;i++){
        //     nums[i]=1;
        // }
        // for(int i = z+o;i<z+o+t;i++){
        //     nums[i]=2;
        // }
    }
}