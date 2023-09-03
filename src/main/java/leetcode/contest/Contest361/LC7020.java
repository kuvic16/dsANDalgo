package leetcode.contest.Contest361;

public class LC7020 {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<= high; i++){
            String s = String.valueOf(i); 
            if(s.length() % 2 == 0){
                int j=0, k=s.length()-1, left=0, right=0;
                while(j<k){
                    left += Integer.valueOf(s.charAt(j++));
                    right += Integer.valueOf(s.charAt(k--));
                }
                if(left == right) count += 1;
            }
        }
        return count;
    }
}

class LC7020Test {
    public static void main(String[] args){
        LC7020 lc7020 = new LC7020();
        //System.out.println(lc7020.countSymmetricIntegers(1, 100));
        System.out.println(lc7020.countSymmetricIntegers(1200, 1230));
    }
}