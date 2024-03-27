package leetcode.dp_2d;

public class LC1143 {

    String a = "", b = "";
    //int[][] disk = {};

    public int longestCommonSubsequence(String text1, String text2) {
        a = text1; b = text2;
        int[][] disk = new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<text1.length(); i++){
            for(int j=0; j<text2.length(); j++){
                disk[i][j] = -1;
            }
        }
        return traverse(text1.length(), text2.length(), disk);
    }

    public int traverse(int i, int j, int[][] disk){
        if(i == 0 || j == 0) return 0;
        if(disk[i][j] != -1){
            return disk[i][j];
        }
        if(a.charAt(i-1) == b.charAt(j-1)) {
            disk[i][j] = 1 + traverse(i - 1, j - 1, disk);
        }else{
            disk[i][j] = Math.max(traverse(i, j-1, disk), traverse(i-1, j, disk));
        }
        return disk[i][j];
    }

    public static void main(String[] args){
        LC1143 lc1143 = new LC1143();
        String a = "";
        String b = "";

        a = "abde";
        b = "ace";

//        a = "oxcpqrsvwf";
//        b = "shmtulqrypy"; //2
//
//        a = "pmjghexybyrgzczy";
//        b = "hafcdqbgncrcbihkd";

//        a = "mhunuzqrkzsnidwbun";
//        b = "szulspmhwpazoxijwbq";

        System.out.println(lc1143.longestCommonSubsequence(a, b));
    }
}
