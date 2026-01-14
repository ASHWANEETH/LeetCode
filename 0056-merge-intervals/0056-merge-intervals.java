class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        List<List<Integer>> l = new ArrayList<>();
        l.add(Arrays.asList(intervals[0][0],intervals[0][1]));

        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] <= l.get(l.size()-1).get(1)){
                l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),intervals[i][1]));
            }
            else{
                l.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
        }
        
        
        
        
        //-----------brute
        // for(int i =0;i<intervals.length;i++){
        //     int s = intervals[i][0];
        //     int e = intervals[i][1];
        //     if(!l.isEmpty() && e <= l.get(l.size()-1).get(1))continue;

        //     for(int j = i+1;j<intervals.length;j++){
        //         if(e>=intervals[j][0]){
        //             e = Math.max(intervals[j][1],e);
        //         }
        //         else break;
        //     }
        //     l.add(Arrays.asList(s,e));
        // }
        int[][] arr = new int[l.size()][2];

        for(int i = 0; i < l.size(); i++){
            arr[i][0] = l.get(i).get(0);
            arr[i][1] = l.get(i).get(1);
        }
        return arr;
    }
}