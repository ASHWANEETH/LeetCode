class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            long a = 1;
            for(int j = 0;j<=i;j++){
                temp.add((int)a); //overflow risk
                a*=i-j;
                a/=j+1;
            }
            ans.add(temp);
        }
        return ans;
    }
}