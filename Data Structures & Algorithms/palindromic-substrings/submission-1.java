class Solution {
    
    public int countSubstrings(String s) {
        
        int count = 0;

        for(int i=0; i<s.length(); i++){

            String res = "";

            for(int j=i; j<s.length(); j++){

                char ch = s.charAt(j);

                res = res + ch;

                if(ispalindrome(res)){
                    count++;
                }
            }
        }

        return count;
    }

    public boolean ispalindrome(String str){

        int i=0;   int j = str.length()-1;

        while(i <= j){

            if(str.charAt(i) != str.charAt(j)){
                 return false;
            }

            i++;  j--;
        }

        return true;
    }
}
