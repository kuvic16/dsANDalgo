package leetcode.array_and_string;

public class LC1768 {
    public String mergeAlternately(String word1, String word2) {
        
        int n1 = word1.length();
        int n2 = word2.length();

        int n = n1 > n2 ? n1 : n2;
        String result = "";
        for(int i=0; i<n; i++){
            if(i < word1.length()){
                result += word1.charAt(i);
            }

            if(i < word2.length()){
                result += word2.charAt(i);
            }
        }
        return result;
    }
}

class LC1768Test{
    public static void main(String[] args){
        LC1768 lc1768 = new LC1768();
        System.out.println(lc1768.mergeAlternately("abc", "pqr"));
        System.out.println(lc1768.mergeAlternately("abcd", "pq"));
    }
}
