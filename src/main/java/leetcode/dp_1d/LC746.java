package leetcode.dp_1d;

public class LC746 {
    int min_cost = Integer.MAX_VALUE;
    int[] disk = new int[1000];

    public int minCostClimbingStairs(int[] cost) {
        int r = traverse(cost, 0, 0);
        disk = new int[1000];
        int rr = traverse(cost, 1, 0);
        //System.out.println(r);
        //traverse(cost, 1, 0);
        return min_cost;
    }

    public int traverse(int[] cost, int index, int total_cost){
        if(index >= cost.length) {
            if(min_cost > total_cost) min_cost = total_cost;
            return min_cost;
        }

        if(disk[index] == 0) {
            total_cost += cost[index];
            traverse(cost, index + 1, total_cost);
            traverse(cost, index + 2, total_cost);

            //disk[index] = min_cost;
        }
        return disk[index];
    }

//    public void traverse(int[] cost, int index, int total_cost){
//        if(index >= cost.length) {
//            if(min_cost > total_cost) min_cost = total_cost;
//            return;
//        }
//        total_cost += cost[index];
//        traverse(cost, index + 1, total_cost);
//        traverse(cost, index + 2, total_cost);
//    }

    public static void main(String[] args){
        LC746 lc746 = new LC746();
        int[] cost = {};
        //cost = new int[]{10,15,20};
        cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(lc746.minCostClimbingStairs(cost));
    }
}
