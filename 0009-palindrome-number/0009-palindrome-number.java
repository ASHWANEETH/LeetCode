class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int a = 0;
        while(x>0){
            int l = x%10;
            x = x/10;
            if (a > Integer.MAX_VALUE/10 || (a == Integer.MAX_VALUE/10 && l > 7)) return false;
            if (a < Integer.MIN_VALUE/10 || (a == Integer.MIN_VALUE/10 && l < -8)) return false;

            a = a*10+(l);
        }
        return a == dup;
    }
}
