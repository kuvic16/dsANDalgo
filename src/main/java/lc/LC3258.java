package lc;

public class LC3258 {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length(), count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(s.charAt(i) != s.charAt(j)) count++;
            }
        }
        return count;
    }
}

class LC3258Test {
    public static void main(String[] args){
        LC3258 lc3258 = new LC3258();
        String s = "10101"; int k = 1;
        int result = lc3258.countKConstraintSubstrings(s, k);
        System.out.println(result);
    }
}