class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Queue<Integer> heap = new PriorityQueue<>();
        for(int x:nums){
            heap.offer(x);
            if(heap.size()>k) heap.poll();
        }
        return heap.poll();



        //If range is small and given
        // int freq[] = new int[20001];
        // for(int x:nums){
        //     freq[10000+x]++;
        // }
        // int i = freq.length-1;
        // while(k!=0){
        //     if(freq[i]==0){i--;continue;}
        //     else{freq[i]--;k--;}
        // }
        // return i-10000;


        // int l = 0;
        // int r = nums.length-1;

        // while(true){
        //     int p = part(nums,l,r);
        //     if(p == k-1) return nums[p];
        //     else if(p<k-1) {l=p+1;}
        //     else r=p-1;
        // }

    }
    // public int part(int[] arr,int l,int r){
    //     int p = arr[r];
    //     int i = l;

    //     for(int j = l;j<r;j++){
    //         if(arr[j]>p){
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //             i++; 
    //         }
    //     }
    //     int temp = arr[i];
    //     arr[i] = arr[r];
    //     arr[r] = temp;
    //     return i;
    // }
}