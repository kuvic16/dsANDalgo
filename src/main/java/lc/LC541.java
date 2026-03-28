package lc;

public class LC541 {
    public String reverseStr(String s, int k) {
        int left = 0;
        char[] chars = s.toCharArray();
        while(left < chars.length){
            int i=left, j=left+k-1;
            if(j >= chars.length) j = chars.length-1;
            while(i<j && i<chars.length && j<chars.length){
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++; j--;
            }
            left += (k + k);
        }
        return String.valueOf(chars);
    }
}

//bacdfeg
class LC541Test {
    public static void main(String[] args){
        LC541 lc541 = new LC541();
        //String s = "abcdefg"; int k = 2;
        String s = "abcdefg"; int k = 8;
        //String s = "abcdefg"; int k = 3;
        String result = lc541.reverseStr(s, k);
        System.out.println(result);
    }
}

