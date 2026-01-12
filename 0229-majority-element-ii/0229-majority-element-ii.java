class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int m = nums.length/3;
        int c1 = 0; int el1 = Integer.MIN_VALUE;
        int c2 = 0; int el2 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(el1==nums[i])c1++;
            else if(el2==nums[i])c2++;
            else if(c1==0){
                el1 = nums[i];
                c1=1;
            }
            else if(c2==0){
                el2 = nums[i];
                c2=1;
            }
            else {c1--;c2--;}

        }
        c1=0;
        c2=0;
        for(int x:nums){
            if(x==el1)c1++;
            if(x==el2)c2++;
        }
        if(c1>m)ans.add(el1);
        if(c2>m)ans.add(el2);
        return ans;
    }
}