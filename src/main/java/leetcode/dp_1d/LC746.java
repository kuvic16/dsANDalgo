package leetcode.dp_1d;

public class LC746 {
    int[] disk = new int[10];

    public int minCostClimbingStairs(int[] cost) {
        for(int i=cost.length-1; i>=0; i--){
            disk[i] = -1;
            traverse(cost, i, 0);
            //System.out.println(a1);
            //for(int x : disk) System.out.print(x + " ");
            //System.out.println();
        }
        return Math.min(disk[0], disk[1]);
    }

    public int traverse(int[] cost, int index, int total_cost) {
        if (index >= cost.length) {
            return total_cost;
        }
        if (disk[index] == -1) {
            int m = traverse(cost, index + 1, total_cost + cost[index]);
            int n = traverse(cost, index + 2, total_cost + cost[index]);
            disk[index] = Math.min(m, n);
        }
        return total_cost + disk[index];
    }

    public static void main(String[] args){
        LC746 lc746 = new LC746();
        int[] cost = {};
        cost = new int[]{10,15,20};
        cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        cost = new int[]{0,0,1,0};
        System.out.println(lc746.minCostClimbingStairs(cost));
    }
}
