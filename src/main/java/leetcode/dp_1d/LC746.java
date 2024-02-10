package leetcode.dp_1d;

public class LC746 {
    int min_cost = Integer.MAX_VALUE;
    public int minCostClimbingStairs(int[] cost) {
        traverse(cost, 0, 0);
        traverse(cost, 1, 0);
        return min_cost;
    }

    public void traverse(int[] cost, int index, int total_cost){
        if(index >= cost.length) {
            if(min_cost > total_cost) min_cost = total_cost;
            return;
        }
        total_cost += cost[index];
        traverse(cost, index + 1, total_cost);
        traverse(cost, index + 2, total_cost);
    }

    public static void main(String[] args){
        LC746 lc746 = new LC746();
        int[] cost = {};
//        cost = new int[]{10,15,20};
        cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(lc746.minCostClimbingStairs(cost));
    }
}
