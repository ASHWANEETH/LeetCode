class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        boolean seen[] = new boolean[1001];
        boolean added[] = new boolean[1001];
        int count=0;
        
        for(int x:nums1) seen[x]=true;
        for(int x:nums2) {
            if(seen[x] && !added[x]){
                added[x] = true;
                count++;
            }
        }
        int arr[] = new int[count];
        int i = 0;
        for(int j = 0;j<added.length;j++){
            if(added[j]) {arr[i]=j; i++;}
        }

        return arr;
        
        
        
        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> sans = new HashSet<>();
        // for(int x:nums1){
        //     set1.add(x);
        // }
        // for(int x:nums2){
        //     if(set1.contains(x)) sans.add(x);
        // }
        // int arr[] = new int[sans.size()];
        // int i =0;
        // for(int x : sans){
        //     arr[i] = x;
        //     i++;
        // }
        // return arr;
    }
}