class Solution {
    public int missingNumber(int[] nums) {
        int s = 0;
        int rs = 0;
        for(int i = 0;i<nums.length;i++){
            s+=i+1;
            rs+=nums[i];
        }
        return s-rs;
    }
}