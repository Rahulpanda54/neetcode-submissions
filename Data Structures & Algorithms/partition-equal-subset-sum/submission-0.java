class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum/2;

        Boolean dp[][] = new Boolean[nums.length][target+1];

        return solve(0, nums, target, dp);
    }

    public boolean solve(int idx, int arr[], int target, Boolean dp[][]){

        if(idx >= arr.length){
            return target == 0;
        }

        if(dp[idx][target] != null){
            return dp[idx][target];
        }

        boolean incl = false;

        if(arr[idx] <= target){

            incl = solve(idx+1, arr, target-arr[idx], dp);
        }

        boolean excl = solve(idx+1, arr, target, dp);

        return dp[idx][target] =  incl || excl;

    }
}
