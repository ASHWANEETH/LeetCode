class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
                z++;
            }
        }



        // for(int i = nums.length-1;i>=0;i--){
        //     if(nums[i]==0){
        //         int x =i;
        //         while(x<nums.length-1 && nums[x+1]!=0){
        //             int temp = nums[x+1];
        //             nums[x+1] = nums[x];
        //             nums[x] = temp;
        //             x++;
        //         }
        //     }
        // }
    }
}