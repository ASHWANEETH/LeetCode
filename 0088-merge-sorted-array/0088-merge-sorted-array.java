class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = nums1.length-1;
        int l = m-1;
        int r = n-1;

        while(r>=0){
            if(l>=0 && nums1[l]>nums2[r]){
                nums1[x] = nums1[l];
                l--;
            }
            else{
                nums1[x] = nums2[r];
                r--;
            }
            x--;
            // nums1[x--] = (l>=0 && (nums1[l]>nums2[r])) ? nums1[l--] : nums2[r--]; -> this also works
        }
        
        // for(int i = 0;i<nums2.length;i++){
        //     nums1[i+m]=nums2[i];
        // }
        // Arrays.sort(nums1);
    }
}