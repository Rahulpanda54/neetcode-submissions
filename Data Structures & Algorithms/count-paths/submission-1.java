class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){

                dp[i][j] = -1;
            }
        }
        
        return solve(0, 0, m , n,  dp);
    }

    public int solve(int i, int j, int n, int m, int dp[][]){

        if(i >= n || j>= m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = solve(i+1, j, n, m, dp);
        int right = solve(i, j+1, n, m, dp);

        return dp[i][j] =  down + right;
    }
}
