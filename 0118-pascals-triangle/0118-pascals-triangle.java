class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1 ;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            int a = 1;
            for(int j = 1;j<=i;j++){
                temp.add(a);
                a*=i-j;
                a/=j;
            }
            ans.add(temp);
        }
        return ans;
    }
}