package leetcode.graph.dfs;

public class LC399 {
    int[] par = {};
    public void disjointSet(){
        par = new int[]{1, 2, 3, 4, 5};
        
    }

    public void union(int a, int b){
        int u = find(a);
        int v = find(b);
        if(u == v) System.out.println("They are already fiends");
        else par[u]=v;
    }

    public int find(int r){
        if(par[r] == r) return r;
        return find(par[r]);
    }
}

class LC399Test {
    public static void main(String[] args){
        LC399 lc399 = new LC399();
        lc399.disjointSet();
    }
}
