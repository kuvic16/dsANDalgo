package lc;

public class LC3258 {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length(), count = 0, onecount = 0, zerocount = 0;
        for(int i=0; i<n; i++){
            onecount = 0; zerocount = 0;
            for(int j=i; j<n; j++){
                if(s.charAt(j) == '0') zerocount++;
                else onecount++;
                if(onecount <= k || zerocount <= k) count++;
                if(onecount > k && zerocount > k) break;
            }
        }
        return count;
    }
}

class LC3258Test {
    public static void main(String[] args){
        LC3258 lc3258 = new LC3258();
        //String s = "10101"; int k = 1;
//        String s = "1010101"; int k = 2;
        String s = "11111"; int k = 1;
        int result = lc3258.countKConstraintSubstrings(s, k);
        System.out.println(result);
    }
}