class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, nums, target, ans, ds);

        return ans;
    }

    void solve(int idx, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){

        if(idx >= arr.length){

            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }

            return;
        }

        if(arr[idx] <= target){

            ds.add(arr[idx]);
            solve(idx, arr, target-arr[idx] , ans, ds);
            ds.remove(ds.size()-1);
        }

        solve(idx+1, arr, target, ans, ds);
    }
}
