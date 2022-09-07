package leetcode.beginners_guide;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null || ransomNote == null) return false;



        char[] rs = ransomNote.toCharArray();
        char[] ms = magazine.toCharArray();
        boolean result = true;
        //System.out.println(ms);
        for(char r : rs){
            System.out.println(r);
            for(char m : ms){
                if(m == r) {
                    System.out.println("found");
                }
            }
            result = Arrays.asList(ms).contains(r);
        }
        return result;
    }
}

class RansomNoteTest{
    public static void main(String[] args){
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("aab", "baa"));
    }
}
