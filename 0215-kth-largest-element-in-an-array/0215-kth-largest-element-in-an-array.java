class Solution {
    public int findKthLargest(int[] nums, int k) {
        int freq[] = new int[20001];
        for(int x:nums){
            freq[10000+x]++;
        }
        int i = freq.length-1;
        while(k!=0){
            if(freq[i]==0){i--;continue;}
            else{freq[i]--;k--;}
        }
        return i-10000;
    }
}