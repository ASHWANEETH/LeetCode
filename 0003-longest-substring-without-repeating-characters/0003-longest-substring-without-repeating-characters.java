class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        int j = 0;
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) ){
                j=Math.max(map.get(s.charAt(i))+1,j);
            }
            map.put(s.charAt(i),i);
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}