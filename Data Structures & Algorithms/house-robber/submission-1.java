class Solution {
    public int rob(int[] nums) {

        int dp[] = new int[nums.length+1];

        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        
        return solve(0, nums, dp);
    }

    public int solve(int idx, int arr[], int dp[]){

        if(idx >= arr.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int incl = arr[idx] + solve(idx+2, arr, dp);
        int excl = 0 + solve(idx+1, arr, dp);

        return dp[idx] = Math.max(incl, excl);
    }
}
