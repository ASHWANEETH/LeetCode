class Solution {
    public int fib(int n) {
        // int dp[] = new int[n+1];
        if(n<=1)return n;
        // dp[0]=0;
        // dp[1]=1;
        int pre = 0;
        int pre2 = 1;
        int cur=1;
        for(int i = 2;i<n+1;i++){
            cur = pre+pre2;
            pre = pre2;
            pre2 = cur;
        }
        return cur;
    }
}