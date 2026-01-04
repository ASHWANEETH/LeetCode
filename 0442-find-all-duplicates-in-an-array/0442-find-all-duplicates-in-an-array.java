class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int cr = nums[i]-1;
            if(nums[i] != nums[cr]){
                int temp = nums[i];
                nums[i] = nums[cr];
                nums[cr] = temp;
            }else i++;
        }

        for(i = 0 ; i< nums.length;i++){
            if(nums[i]!=i+1) ans.add(nums[i]);
        }

        // for(int i = 0;i<nums.length;i++){
        //     int idx = Math.abs(nums[i])-1;

        //     if(nums[idx] < 0) ans.add(idx+1);
        //     else nums[idx] = -nums[idx];
        // }

        // Set<Integer> set = new HashSet<>();
        // for(int x:nums){
        //     if(!set.add(x)) ans.add(x);
        // }
        return ans;
    }
}