class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int ans[] = new int[nums.length];
        for(int x:nums){
            if(x>=0){ans[p]=x;p+=2;}
            else{ans[n]=x;n+=2;}
        }
        return ans;
    }
}