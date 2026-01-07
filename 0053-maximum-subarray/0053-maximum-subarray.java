class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int res = nums[0];
        // int s=0,e=0,ss=0; -->if want to print subarray;
        for(int i = 0;i<nums.length;i++){
            // if(total == 0) ss=i;
            total += nums[i];

            if(res<total){
                res = total;
                // s=ss;e=i;
            }

            if(total<0)total=0;
        }
        // for(int i = s;i<=e;i++){
        // System.out.print(nums[i]+" ");
        // }
        return res;
    }
}