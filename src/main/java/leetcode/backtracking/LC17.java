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
    char[] lt = {};

    public List<String> letterCombinations(String digits) {
        lt = digits.toCharArray();
        List<String> sets = new ArrayList<>();
        traverse(0, sets);
        return result;
    }

    public void traverse(int index, List<String> sets){
        if(index >= lt.length) return;

        String[] ls = letters[Character.getNumericValue(lt[index]) - 2];
        for(String s : ls){
            sets.add(s);
            //for(String ss : sets) System.out.print(ss + ">");
            if(sets.size() == lt.length) {
                StringBuilder ns = new StringBuilder();
                for (String ss : sets) ns.append(ss);
                result.add(ns.toString());
            }
            traverse(index+1, sets);
            sets.remove(sets.size() - 1);
        }
    }



    public static void main(String[] args){
        LC17 lc17 = new LC17();
        String digits = "";
        digits = "23";
        List<String> results = lc17.letterCombinations(digits);
        for(String result: results) System.out.println(result);
    }
}
