class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }

        int arr[] = new int[k];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
          
          for(int i : map.keySet()){
            pq.add(i);
          }

          for(int i=0; i<k; i++){
               arr[i] = pq.remove();
          }

        
          return arr;
    }
}
