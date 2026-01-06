class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int dup = x;
        int a = 0;
        while(x!=0){
            int l = x%10;
            x = x/10;
            a = a*10+(l);
        }
        return a == dup;
    }
}
