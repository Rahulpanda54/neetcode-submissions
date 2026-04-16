class Solution {

    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;  int right = 0;  int len = 0;  int maxfreq = 0;

        while(right < s.length()){

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(ch));

            while((right-left+1) - maxfreq  > k){

                char chh = s.charAt(left);

                if(map.get(chh) == 1){
                    map.remove(chh);
                }

                else{
                      map.put(chh, map.get(chh) - 1);
                }

                left++;
            }

            if((right-left+1) - maxfreq <= k){

                len = Math.max(len, right-left+1);
            }

            right++;
        }

           return len;
    }
}
