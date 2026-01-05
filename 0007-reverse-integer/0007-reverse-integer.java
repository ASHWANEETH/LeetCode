class Solution {
    public int reverse(int x) {
        int a = 0;
        // boolean xx = x<0;
        // x = Math.abs(x);
        while(x!=0){
            int l = x%10;
            x = x/10;
            if (a > Integer.MAX_VALUE/10 || (a == Integer.MAX_VALUE/10 && l > 7)) return 0;
            if (a < Integer.MIN_VALUE/10 || (a == Integer.MIN_VALUE/10 && l < -8)) return 0;

            a = a*10+(l);
        }
        return a;
    }
}