class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        boolean used[] = new boolean[nums.length];

        solve(nums, ans, ds, used);

        return new ArrayList<>(ans);
    }

    void solve(int arr[], HashSet<List<Integer>> ans, List<Integer> ds, boolean used[]){

        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<arr.length; i++){

            if(used[i] == false){

                ds.add(arr[i]);
                used[i] = true;
                solve(arr, ans, ds, used);
                ds.remove(ds.size()-1);
                used[i] = false;
                
            }
        }
    }
}
