class Solution {
    public String removeOuterParentheses(String s) {
        int start = 0;int end=0;int sum=0;
        StringBuilder ans = new StringBuilder();
        while(end<s.length()){
            if(s.charAt(end)=='('){
                sum++;
            }
            else{sum--;}
            if(sum==0){
                ans.append(s.substring(start+1,end));
                
                start = end+1;
            }
            end++;
        }
        return ans.toString();
    }
}