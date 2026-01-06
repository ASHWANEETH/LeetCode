class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int look = target-nums[i];
            if(map.containsKey(look)) return new int[]{i,map.get(look)};
            map.put(nums[i],i);
        }
        return new int[0];
    }
}