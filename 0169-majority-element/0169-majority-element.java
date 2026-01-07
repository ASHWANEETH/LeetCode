class Solution {
    public int majorityElement(int[] nums) {
        int c = 1;
        int x = nums[0];
        for(int i=1;i<nums.length;i++){
            if(c == 0)x=nums[i];
            if(nums[i]==x)c++;
            else c--;
        }
        return x;
    }
}