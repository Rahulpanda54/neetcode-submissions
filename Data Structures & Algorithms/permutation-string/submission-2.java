class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int windowsize = s1.length();

        for(int i=0; i<s2.length()-windowsize + 1; i++){

            HashMap<Character, Integer> map2 = new HashMap<>();

            for(int j=i;  j<i+windowsize;  j++){
                
                char chh = s2.charAt(j);

                map2.put(chh, map2.getOrDefault(chh, 0) + 1);
            }

            if(map.equals(map2)){
                return true;
            }
        }

        return false;
    }
}
