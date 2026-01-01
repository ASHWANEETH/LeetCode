class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int rsum =0;
        for(int i = 0;i<nums.length;i++){
            rsum+=nums[i];
            sum+=i+1;
        }
        return sum-rsum;
    }
}