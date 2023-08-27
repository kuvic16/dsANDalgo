package leetcode.contest.Contest360;

public class LC8015 {
    public int furthestDistanceFromOrigin(String moves) {
        int d1 = 0, d2 = 0;
        for(char c : moves.toCharArray()){
            if(c == '_' || c == 'L') d1 -= 1;
            else d1 += 1;
        }
        if(d1 < 0) d1 = (d1 * -1);

        for(char c : moves.toCharArray()){
            if(c == '_' || c == 'R') d2 += 1;
            else d2 -= 1;
        }
        if(d2 < 0) d2 = (d2 * -1);

        return d1 > d2 ? d1 : d2;
    }
}

class LC8015Test {
    public static void main(String[] args){
        LC8015 lc8015 = new LC8015();
        //System.out.println(lc8015.furthestDistanceFromOrigin("L_RL__R"));
        System.out.println(lc8015.furthestDistanceFromOrigin("_R__LL_"));
    }
}