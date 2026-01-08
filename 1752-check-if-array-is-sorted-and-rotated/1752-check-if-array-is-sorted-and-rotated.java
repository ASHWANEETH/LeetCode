class Solution {
    public boolean check(int[] nums) {
        
        int l = nums[nums.length-1];
        int i = nums.length-1;
        while(i>0 && nums[i]>=nums[i-1]){
            i--;
        }
        if(i==0)return true;
        int j=0;
        while(j<i){
            if(nums[j]>=l){
                l=nums[j];
                j++;
            }
            else return false;
        }
        return true;
    }
}