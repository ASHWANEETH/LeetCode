class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        disjoint du = new disjoint(n/2 +1);
        for(int i=0;i<row.length;i+=2){
            du.union(row[i]/2,row[i+1]/2);
        }
        int cnt=0;
        for(int i=0;i<n/2;i++){
            if(du.find(i) == i)cnt++;
        }
        return n/2-cnt;
    }
}
class disjoint{
    int rank[];
    int par[];
    disjoint(int n){
        rank = new int[n];
        par = new int[n];
        for(int i=0;i<n;i++){
            par[i] =i;
        }
    }
    public int find(int p){
        if(par[p] == p)return p;
        return par[p] = find(par[p]);
    }
    public void union(int u,int v){
        int pu=find(u);
        int pv = find(v);
        if(pu == pv)return;
        if(rank[pu]<rank[pv])par[pu]=pv;
        else if(rank[pv]<rank[pu])par[pv]=pu;
        else{
            par[pv]=pu;
            rank[pu]++;
        }
    }
}