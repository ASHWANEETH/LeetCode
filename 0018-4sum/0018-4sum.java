class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;

            // Minimum possible sum at this i
            long mini = (long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3];
            if(mini>target)break;
            // Max possible sum at this i
            long max = (long)nums[i]+nums[n-1]+nums[n-2]+nums[n-3];
            if(max<target)continue;

            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;

                long min2 = (long)nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if(min2 > target) break;

                long max2 = (long)nums[i] + nums[j] + nums[n-1] + nums[n-2];
                if(max2 < target) continue;

                int l = j+1;
                int r = n-1;

                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];//int-> may overflow..

                    if(sum>target)r--;
                    else if(sum<target)l++;
                    else if(sum==target){

                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;r--;
                        while(l<r && nums[l]==nums[l-1]){l++;}
                        while(l<r && nums[r]==nums[r+1]){r--;}

                    }
                }
            }
        }
        return ans;
    }
}