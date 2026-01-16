class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1.0;
        long nn = n;
        if(nn<0) nn=-nn;

        while(nn>0){
            if(nn%2==1){
                ans *= x;
                nn--;
            }
            else {
                x *= x;
                nn = nn/2;
            }
        }
        return n<0? 1.0/ans : ans;

        //TLE
        // double ans = 1;
        // int nn = n;
        // if(n<0)nn = -1 * n;
        // for(int i = 1;i<=nn;i++){
        //     ans*=x;
        // }
        // if(n<0) ans = (double)(1.0)/(double)(ans);
        // return ans;
    }
}