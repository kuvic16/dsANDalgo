package Study.dynamic_programming;

/**
 * Create a subset from given integer
 * Input: abc
 * Output: a, (a,b), (a,b,c), (a,c), b, (b,c), c
 */
public class _3_Subsequence_2 {
    String text;
    public void subset(int index, String r){
        if(index >= text.length()) return;
        r = r + " " + text.charAt(index);
        System.out.println(r);
        for(int i=index+1; i<text.length(); i++) {
            subset(i, r);
        }
    }

    public static void main(String[] args){
        _3_Subsequence_2 subsequence = new _3_Subsequence_2();
        String input = "abcd";
        subsequence.text = input;
        for(int i=0; i<input.length(); i++)
        subsequence.subset(i, "");
    }
}
