class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx] < 0) ans.add(idx+1);
            else nums[idx] = -nums[idx];
        }

        // Set<Integer> set = new HashSet<>();
        // for(int x:nums){
        //     if(!set.add(x)) ans.add(x);
        // }
        return ans;
    }
}