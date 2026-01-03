class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int x:nums){
            xor = xor^x;
        }
        return xor;
        
        // Set<Integer> set = new HashSet<>();
        // for(int x : nums){
        //     if(!set.contains(x)) set.add(x);
        //     else{set.remove(x);}
        // }
        // return set.iterator().next();
    }
}