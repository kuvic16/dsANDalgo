package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LC17 {

    String[][] letters = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"}
    };
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        return result;
    }

    public

    public static void main(String[] args){
        LC17 lc17 = new LC17();
        String digits = "";
        digits = "23";
        List<String> results = lc17.letterCombinations(digits);
        for(String result: results) System.out.println(result);
    }
}
