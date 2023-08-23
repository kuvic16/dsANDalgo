package leetcode.sliding_window;

public class LC1456 {
    public int maxVowels(String s, int k) {
        int max = 0, count=0;
        char[] vs = s.toCharArray();
        for(int i=0; i<vs.length; i++){
            if(isVowel(vs[i])) count += 1;
            if(i >= k-1){
                if(max < count) max = count;
                if(isVowel(vs[i-k+1])) count -= 1;
            }
        }
        return max;
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

class LC1456Test {
    public static void main(String[] args){
        LC1456 lc1456 = new LC1456();
        System.out.println(lc1456.maxVowels("abciiidef", 3));
        System.out.println(lc1456.maxVowels("aeiou", 2));
        System.out.println(lc1456.maxVowels("leetcode", 3));
    }
}
