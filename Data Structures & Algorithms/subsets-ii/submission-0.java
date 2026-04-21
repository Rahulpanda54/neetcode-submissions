class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, nums, ds, ans);

        return new ArrayList<>(ans);

    }

    public void solve(int idx, int arr[], List<Integer> ds, HashSet<List<Integer>> ans){
         
         if(idx >= arr.length){
            ans.add(new ArrayList<>(ds));
            return;
         }

         // Include...
         ds.add(arr[idx]);
         solve(idx+1, arr, ds, ans);
         ds.remove(ds.size()-1);

         //Exclude...
         solve(idx+1, arr, ds, ans);

    }
}
