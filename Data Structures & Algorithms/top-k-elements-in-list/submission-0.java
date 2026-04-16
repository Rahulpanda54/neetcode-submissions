class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        
        int res[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)- map.get(b));

        for(int i : map.keySet()){
              pq.add(i);
        }


            while(pq.size() > k){
                  pq.poll();
            }

             
             int idx = 0;

            while(!pq.isEmpty()){
                res[idx++] = pq.poll();
            }

           return res;
        }
    }