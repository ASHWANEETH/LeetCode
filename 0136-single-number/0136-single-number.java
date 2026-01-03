class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.contains(x)) set.add(x);
            else{set.remove(x);}
        }
        return set.iterator().next();
    }
}