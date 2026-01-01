class Solution {
    public int majorityElement(int[] nums) {
        int c = 0,res = 0;

        for(int x:nums){
            if(c==0) res = x;
            c+= (res==x?1:-1);
        }
        return res;
        // int res = 0;
        // int req = nums.length/2;
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int x:nums){
        //     map.put(x,map.getOrDefault(x,0)+1);
        //     if(map.get(x)>req) res = x;
        // }
        // return res;
    }
}