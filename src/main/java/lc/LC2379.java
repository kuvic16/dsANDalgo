package lc;

public class LC2379 {
    public int minimumRecolors(String blocks, int k) {
        // WBBWWBBWBW
        int conv = 0, minconv = Integer.MAX_VALUE;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W') conv++;
        }
        minconv = Math.min(minconv, conv);

        int j=0;
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(j++) == 'W') conv--;
            if(blocks.charAt(i) == 'W') conv++;

            if(conv <= 0) return 0;
            else minconv = Math.min(minconv, conv);
        }
        System.out.println(conv);
        return minconv;
    }
}

class LC2379Test {
    public static void main(String[] args){
        LC2379 lc2379 = new LC2379();
        String blocks = "WBBWWBBWBW"; int k=7;
        //String blocks = "WBWBBBW"; int k=2;
        int out = lc2379.minimumRecolors(blocks, k);
        System.out.println(out);
    }
}