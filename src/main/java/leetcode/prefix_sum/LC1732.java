package leetcode.prefix_sum;

public class LC1732 {
    public int largestAltitude(int[] gain) {
        int max = 0, prev = 0;
        for(int i=0; i<gain.length; i++){
            gain[i] += prev;
            if(gain[i] > max) max = gain[i]; 
            prev = gain[i];
        }
        return max;
    }
}

class LC1732Test{
    public static void main(String[] args){
        LC1732 lc1732 = new LC1732();
        System.out.println(lc1732.largestAltitude(new int[]{-5,1,5,0,-7})); //1
        System.out.println(lc1732.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2})); //1
    }
}
