package lc;

public class LC680 {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1; boolean is_left = false, is_right = false;
        int lefti = -1, righti = -1;
        while(left < right && right >= 0 && left < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else if(is_right == false){
                righti = right;
                lefti = left;
                right--;
                is_right = true;
            }else if(is_left == false){
                left = lefti;
                left++;
                right = righti;
                is_left = true;
            }else {
                return false;
            }
        }
        return true;
    }
}

class LC680Test {
    public static void main(String[] args){
        LC680 lc680 = new LC680();
//        String s = "abca";
//        String s = "abc";
        String s = "gmlueuppuclmg";
//        String s = "eceec";
        boolean result = lc680.validPalindrome(s);
        System.out.println(result);
    }
}
