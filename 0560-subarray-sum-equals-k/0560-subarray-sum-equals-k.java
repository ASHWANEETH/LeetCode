class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int presum = 0;
        map.put(0,1);

        for(int i = 0;i<nums.length;i++){
            presum+=nums[i];
            res+=(map.getOrDefault(presum-k,0));
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return res;
        
    }
}