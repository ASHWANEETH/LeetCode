class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            if(!set.add(x)) ans.add(x);
        }
        return ans;
    }
}