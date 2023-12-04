package Study.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a subset from given integer
 * Input: abc
 * Output: a, (a,b), (a,b,c), (a,c), b, (b,c), c
 */
public class _3_Subsequence_3 {
    String text;
    int s = 0;
    public void subset(int index, String r, int sum){
        if(index >= text.length()) return;
        r = r + " " + text.charAt(index);
        //System.out.println(r);
        for(int i=index+1; i<text.length(); i++) {
            subset(i, r, sum + 1);
        }
        s += 1;
        System.out.println( r + ">>" + s);
    }

    public static List<String> generateSubsequences(String s) {
        int n = s.length();
        List<String> subsequences = new ArrayList<>(1 << n);

        // Fill in the first element with an empty string
        subsequences.add("");

        for (int i = 0; i < n; i++) {
            int currentSize = subsequences.size();
            for (int j = 0; j < currentSize; j++) {
                subsequences.add(subsequences.get(j) + s.charAt(i));
            }
        }

        return subsequences;
    }


    public static void main(String[] args){
        _3_Subsequence_3 subsequence = new _3_Subsequence_3();
//        String input = "abcd";
//        subsequence.text = input;
//        for(int i=0; i<input.length(); i++)
//        subsequence.subset(i, "", 0);

        String stringToGenerateSubsequences = "123456789012345678901234567890123456789012345678901";
        List<String> result = generateSubsequences(stringToGenerateSubsequences);

        // Print the result
        System.out.println(result);
    }
}
