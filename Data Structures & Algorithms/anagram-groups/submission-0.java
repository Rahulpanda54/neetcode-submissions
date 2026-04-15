class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            String s1 = strs[i];

            char arr[] = s1.toCharArray();

            Arrays.sort(arr);

            String curr = new String(arr);

            if(!map.containsKey(curr)){
                map.put(curr, new ArrayList<>());
            } 

            map.get(curr).add(s1);
        }

        List<List<String>> ans = new ArrayList<>();

        for(List<String> list : map.values()){
               ans.add(list);
        }

             return ans;
     }
 }


