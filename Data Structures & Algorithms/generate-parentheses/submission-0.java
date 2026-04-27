class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();

        solve(n, n, arr, "");

        return arr;
    }

    public void solve(int left, int right, List<String> arr, String str){

        if(left == 0 && right == 0){
            arr.add(str);
            return;
        }

        if(left > 0){
            solve(left-1, right, arr, str + "(");
        }

         if(right > left){
            solve(left, right-1, arr, str + ")");
        }
    }
}
