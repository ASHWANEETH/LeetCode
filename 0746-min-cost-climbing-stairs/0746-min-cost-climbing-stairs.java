class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev2 = cost[0];
        int prev1 = cost[1];

        for(int i = 2;i<n;i++){
            int cur = cost[i] + Math.min(prev1,prev2);
            prev2 = prev1;
            prev1 = cur;
        }

        return Math.min(prev1,prev2);






        // int dp[] = new int[n+1];
        // dp[0] = cost[0];
        // dp[1] = cost[1];

        // for(int i = 2 ; i<n;i++){
        //     dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        // }
        // return Math.min(dp[n-1],dp[n-2]);
        




        // return Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
    }
    // public int solve(int[] cost,int n,int[] dp){
    //     if(n==1) return cost[1];
    //     if(n==0) return cost[0];

    //     if(dp[n]!=0)return dp[n];

    //     dp[n] = cost[n] + Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
    //     return dp[n];
    // }
}