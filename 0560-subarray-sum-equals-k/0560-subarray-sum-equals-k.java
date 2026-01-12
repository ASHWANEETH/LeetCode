class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ps=0;
        int c=0;
        map.put(ps,1);
        for(int i = 0;i<nums.length;i++){
            ps+=nums[i];
            int look = ps-k;
            if(map.containsKey(look))c+=map.get(look);
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return c;
    }
}