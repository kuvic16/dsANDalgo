package lc;

public class LC696 {
    public int countBinarySubstrings(String s) {
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){

            }
        }
        return 0;
    }
}

class LC696Test {
    public static void main(String[] args) {
        LC696 lc696 = new LC696();
        String s = "00110011";
        lc696.countBinarySubstrings(s);
    }
}
