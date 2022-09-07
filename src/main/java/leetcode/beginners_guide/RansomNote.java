package leetcode.beginners_guide;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null || ransomNote == null) return false;

        char[] rs = ransomNote.toCharArray();
        char[] ms = magazine.toCharArray();
        boolean result = true;
        boolean isExist = false;

        for(char r : rs){
            isExist = false;
            for(int i=0; i<ms.length; i++){
                if(ms[i] == r) {
                    isExist = true;
                    ms[i] = '$';
                    break;
                }
            }
            result = result && isExist;
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
