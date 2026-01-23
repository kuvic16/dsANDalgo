package lc;

public class LC2269 {
    public int divisorSubstrings(int num, int k) {
        String nums = String.valueOf(num);
        int count = 0;
        //240
        for(int i=0; i + k -1<nums.length(); i++){
            String sub = nums.substring(i, i+k);
            System.out.println(sub);
            if(Integer.valueOf(sub) != 0 && num % Integer.valueOf(sub) == 0) count++;
        }
        return count;
    }
}

class LC2269Test{
    public static void main(String[] args){
        LC2269 lc2269 = new LC2269();
//        int num = 240, k=2;
        int num = 430043, k=2;
        int out = lc2269.divisorSubstrings(num, k);
        System.out.println(out);
    }
}
