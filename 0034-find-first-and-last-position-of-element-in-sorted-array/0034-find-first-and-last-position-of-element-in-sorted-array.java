class Solution {
    public int[] searchRange(int[] nums, int target) {
        int answ[] = new int[]{-1,-1};

        int l=0;
        int h = nums.length-1;
        int ans = -1;
        while(l<=h){
            int mid = l+((h-l)/2);
            if(nums[mid]==target){ans=mid;h=mid-1;}
            else if(nums[mid]<target)l=mid+1;
            else h=mid-1;
        }
        answ[0] = ans;

        l=0;
        h = nums.length-1;
        ans = -1;
        while(l<=h){
            int mid = l+((h-l)/2);
            if(nums[mid]==target){ans=mid;l=mid+1;}
            else if(nums[mid]<target)l=mid+1;
            else h=mid-1;
        }
        answ[1] = ans;
        return answ;
    }
}