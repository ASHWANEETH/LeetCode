class Solution {
    public String minWindow(String s, String t) {

        if(t.length()>s.length())return "";

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int l = 0;
        int r = 0;
        int count = t.length();
        int minlen = Integer.MAX_VALUE;
        int st = 0;

        while(r<s.length()){
            char c1 = s.charAt(r);
            if(map.containsKey(c1)){
                if(map.get(c1)>0)count--;
                map.put(c1,map.get(c1)-1);
            }
            r++;

            while(count==0){
                if(minlen>r-l){
                    minlen=r-l;
                    st=l;
                }

                char c2 = s.charAt(l);
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)>0) count++;
                }
                l++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(st,st+minlen);
    }
}