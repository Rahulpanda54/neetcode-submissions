class Solution {
    public int jump(int[] nums) {
        
        int left = 0;     int right = 0;     int jump = 0;

        while(right < nums.length-1){

             int largest = 0;

            for(int i=left; i<=right; i++){
                largest = Math.max(largest, i+nums[i]);
            }
                if(largest <= right){
                    return -1;
                }

                left = right+1;
                right = largest;

                jump++;
        }

        return jump;
    }
}
