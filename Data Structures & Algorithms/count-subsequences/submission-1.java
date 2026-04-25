class Solution {
    public int numDistinct(String s, String t) {

        int dp[][] = new int[s.length()+1][t.length()+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
        
        return solve(s.length()-1, t.length()-1, s, t, dp);
    }

    public int solve(int i, int j, String s1, String s2 , int dp[][]){

        if(j < 0){
            return 1;
        }

        if(i < 0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] =  solve(i-1, j-1, s1, s2, dp) + solve(i-1, j, s1, s2, dp);
        }

        else{
               return dp[i][j] =  solve(i-1, j, s1, s2, dp);
        }
    }
}
