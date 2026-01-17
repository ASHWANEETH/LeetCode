class Solution {
    public int uniquePaths(int m, int n) {
        int r = m+n-2;
        int c = Math.min(m-1,n-1);

        long ans = 1;
        for(int i=0;i<c;i++){
            ans = ans * (r-i)/(i+1);
        }
        return (int)ans;
    }
}