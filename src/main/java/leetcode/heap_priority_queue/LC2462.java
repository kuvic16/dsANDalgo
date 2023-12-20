package leetcode.heap_priority_queue;

import java.util.PriorityQueue;

public class LC2462 {

    /**
     * Calculates the total cost of selecting candidates from the given array of costs
     * based on the specified constraints.
     *
     * @param costs      An array representing the costs of candidates.
     * @param k          The total number of candidates to select.
     * @param candidates The number of candidates to select in each iteration.
     * @return The total cost of selecting candidates based on the given constraints.
     */
    public long totalCost(int[] costs, int k, int candidates) {
        // Priority queues to store the costs of candidates on the left and right sides.
        PriorityQueue<Integer> leftQueue = new PriorityQueue<>();
        PriorityQueue<Integer> rightQueue = new PriorityQueue<>();

        // Pointers for iterating through the costs array from both ends.
        int R = 0, L = costs.length - 1;

        // Variable to store the total cost.
        long sum = 0;

        // Iterate for the total number of candidates to be selected (k).
        for (int i = 0; i < k; i++) {
            // Populate the leftQueue with costs from the left side.
            while (leftQueue.size() < candidates && R <= L) {
                leftQueue.add(costs[R]);
                R++;
            }

            // Populate the rightQueue with costs from the right side.
            while (rightQueue.size() < candidates && L >= R) {
                rightQueue.add(costs[L]);
                L--;
            }

            // Select the candidate with the minimum cost from either leftQueue or rightQueue.
            if (leftQueue.size() > 0 && rightQueue.size() == 0) {
                sum += leftQueue.poll();
            } else if (rightQueue.size() > 0 && leftQueue.size() == 0) {
                sum += rightQueue.poll();
            } else if (leftQueue.peek() <= rightQueue.peek()) {
                sum += leftQueue.poll();
            } else {
                sum += rightQueue.poll();
            }
        }

        // Return the total cost of selecting candidates.
        return sum;
    }


    public static void main(String[] args){
        LC2462 lc2462 = new LC2462();
        int[] costs = {};
        int k = 0, candidates = 0;

        costs = new int[]{17,12,10,2,7,2,11,20,8};
        k = 3; candidates = 4;

        costs = new int[]{1,2,4,1};
        k = 3; candidates = 3;

        costs = new int[]{31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58}; //423
        k = 11; candidates = 2;

        costs = new int[]{211,169,4359,2335,3956,658,1371,1516,4637,2588,4166,250,4866,3122,1197,61,292,1616,4857,4067,1428,4912,3071,3108,2221,1932,4183,4101,727,2715,64,357,1186,2444,3766,3978,1962,1648,871,2961,1164,4792,1528,2064,2653,179,2780,3732,2881,1165,623,362,2371,1353,4219,4438,3765,4567,1372,4669,1496,3353,4147,33,4378,4634,1331,3014,3723,3271,433,1065,2345,4445,4077,2708,1303,2666,3311,1546,3078,4467,1683,414,4282,3510,478,2858,4805,1113,783,3999,2685,1025,3111,2394,2985,2693,1068,1806,690,4867,4178,1726,1680,1860,155,96,1500,4250,286,4145,771,1728,2677,353,1163,4876,2066,3910,2578,1298,3321,3236,1152,3140,2294,2200,69,3027,3675,3594,74,3575,2279,4874,1071,3085,1786,4596,1584,42,411,3962,2704,4411,1926,1300,4533,2119,3924,1034,128,911,4717,4767,1669,3669,2936,2099,3395,2487,2539,4722,122,642,4680,4813,708,4938,4156,1152,2789,699,4724,4159,1766,2662,492,2612,330,2010,458,161,794,2062,4281,717,3486,3331,474,4734,1869,4817,2796,1511,146,3857,3471,3674,45,519,3035,3830,4566,957,4705,3194,1524,2668,903,2833,2118,929,266,1177,3297,1681,400,2635,1962,1682,2116,603,1521};
        k = 222; candidates = 2; //523545

        System.out.println(lc2462.totalCost(costs, k, candidates));
    }
}
