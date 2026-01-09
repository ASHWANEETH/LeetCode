class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]) {add(l,nums1[i]);i++;}
            else if(nums1[i]>nums2[j]) {add(l,nums2[j]);j++;}
            else if(nums1[i]==nums2[j]) {add(l,nums1[i]);i++;j++;}
        }

        while(i<n1){
            add(l,nums1[i]);i++;
        }
        while(j<n2){
            add(l,nums2[j]);j++;
        }

        int[] arr = new int[l.size()];
        for(i = 0; i < l.size(); i++){
            arr[i] = l.get(i);
        }
        return arr;

    }
    public void add(List<Integer> l,int val){
        if(l.size()==0 || l.get(l.size()-1) != val) l.add(val);
    }
}
