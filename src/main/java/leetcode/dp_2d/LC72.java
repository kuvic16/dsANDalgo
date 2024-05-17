package leetcode.dp_2d;

public class LC72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++){
            dp[i][0] = i;
        }
        for(int j=0; j<=n; j++){
            dp[0][j] = j;
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j];
                }else{
                    int insert = dp[i+1][j];
                    int delete = dp[i][j+1];
                    int replace = dp[i][j];
                    dp[i+1][j+1] = 1 + Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args){
        LC72 lc72 = new LC72();
        System.out.println(lc72.minDistance("horse", "ros"));
    }
}
