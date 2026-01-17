class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1 ;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1;j<i;j++){
                int a = temp.get(temp.size()-1);
                a*=i-j;
                a/=j;
                temp.add(a);
            }
            ans.add(temp);
        }
        return ans;
    }
}