package leetcode.array_and_string;

public class LC1165 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0; i<words.length; i++){
            for(int j=words[i].length()-1; j>=0; j--){
                result.append(words[i].charAt(j));
            }
            if(i != words.length-1) result.append(" ");
        }
        return result.toString();   
    }
}

class LC1165Test{
    public static void main(String[] args){
        LC1165 lc1165 = new LC1165();
        //System.out.println(lc1165.reverseWords("Let's take LeetCode contest"));
        System.out.println(lc1165.reverseWords("God Ding"));
    }
}
