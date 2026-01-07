class Solution {
    public void nextPermutation(int[] nums) {
        //for arr = [1,2,3] - permutations - [1,2,3] < [1,3,2] < [2, 1, 3] < ....<[3, 2, 1]

        //find dip (target) from end
        int target = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                target = i;
                break;
            }
        }

        //if last permutation then reverse :)
        if(target==-1){
            for(int i=0,j=nums.length-1;i<j;i++,j--){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        else{

            //find less one then target and swap
            for(int i = nums.length-1;i>target;i--){
                if(nums[i]>nums[target]){
                    int temp = nums[i];
                    nums[i] = nums[target];
                    nums[target] = temp;
                    break;
                }
            }

            //reverse the after dip ones (coz in descring order always)
            for(int i=target+1,j=nums.length-1;i<j;i++,j--){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        
    }
}