class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        
        for(int i =0;i<intervals.length;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(!l.isEmpty() && e <= l.get(l.size()-1).get(1))continue;

            for(int j = i+1;j<intervals.length;j++){
                if(e>=intervals[j][0]){
                    e = Math.max(intervals[j][1],e);
                }
                else break;
            }
            l.add(Arrays.asList(s,e));
        }
        int[][] arr = new int[l.size()][2];

        for(int i = 0; i < l.size(); i++){
            arr[i][0] = l.get(i).get(0);
            arr[i][1] = l.get(i).get(1);
        }
        return arr;
    }
}