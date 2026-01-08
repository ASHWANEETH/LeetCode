class Solution {
    public boolean check(int[] nums) {
    
    //If more then one i>i+1 -> array cant be rotated
        int c = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])c++;
            if(c>=2) return false;
        }
        if(nums[nums.length-1]>nums[0])c++;
        return c<2;

    //-------// my solution :)
    //     int l = nums[nums.length-1];
    //     int i = nums.length-1;
    //     while(i>0 && nums[i]>=nums[i-1]){
    //         i--;
    //     }
    //     if(i==0)return true;
    //     int j=0;
    //     while(j<i){
    //         if(nums[j]>=l){
    //             l=nums[j];
    //             j++;
    //         }
    //         else return false;
    //     }
    //     return true;
    }
}