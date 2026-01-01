class Solution {
    public boolean isPalindrome(String s) {
        // s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l = 0, r = s.length()-1;
        // while(l<r) {if(s.charAt(l)!=s.charAt(r))return false;l++;r--;} 
        
        
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
            l++;r--;
        }
        return true;
    }
}