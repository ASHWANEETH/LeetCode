class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int x:nums){
            set.add(x);
        }
        for(int num:set){
            if(set.contains(num-1))continue;
            int len=1;
            while(set.contains(num+len))len++;
            res = Math.max(res,len);
        }
        return res;
    }
}