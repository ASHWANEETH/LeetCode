class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int res = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(total<0)total=0;
            total += nums[i];
            res = Math.max(res,total);
        }
        return res;
    }
}