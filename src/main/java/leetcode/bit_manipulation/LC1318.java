package leetcode.bit_manipulation;

public class LC1318 {
    public int minFlips(int a, int b, int c) {
        String as = Integer.toBinaryString(a);
        String bs = Integer.toBinaryString(b);
        String cs = Integer.toBinaryString(c);



        //as.toCharArray()
        for(int i=0; i<as.length(); i++){
            if(as.charAt(i) == '0'){
                //as.replace
            }
        }

        System.out.println(as);
        System.out.println(bs);



        //a = 1; b = 4;
        boolean result = (a | b) == c;
        System.out.println(result);
        return 0;
    }

    public static void main(String[] args){
        LC1318 lc1318 = new LC1318();
        int a = 0, b = 0, c = 0;
        a = 2; b = 60; c = 5;
        System.out.println(lc1318.minFlips(a,b,c));
    }
}
